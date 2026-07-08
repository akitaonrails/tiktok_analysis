package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0EPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364210EPr {
    public static boolean LIZIZ;
    public static final ConcurrentHashMap<String, InterfaceC364230EPt> LIZ = new ConcurrentHashMap<>();
    public static final Stack<String> LIZJ = new Stack<>();

    public static void LIZ(String str) {
        if (str != null) {
            ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = LIZ;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
            Stack<String> stack = LIZJ;
            stack.remove(str);
            if (stack.isEmpty()) {
                LIZIZ = false;
            }
        }
    }

    @InterfaceC1294060jmO
    public static ViewModel LIZIZ(Class cls) {
        ViewModelProvider viewModelProvider;
        ViewModel viewModel;
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(LIZJ);
        if (objLJJLIIIJL == null) {
            return (ViewModel) cls.newInstance();
        }
        InterfaceC364230EPt interfaceC364230EPt = LIZ.get(objLJJLIIIJL);
        if (interfaceC364230EPt != null && (viewModelProvider = interfaceC364230EPt.get()) != null && (viewModel = viewModelProvider.get((Class<ViewModel>) cls)) != null) {
            return viewModel;
        }
        "viewModelProvider is null, please call CKViewModelProvider#init first".toString();
        throw new IllegalArgumentException("viewModelProvider is null, please call CKViewModelProvider#init first");
    }

    public static ViewModel LIZLLL(Class cls) {
        InterfaceC364230EPt interfaceC364230EPt;
        ViewModelProvider viewModelProvider;
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(LIZJ);
        if (objLJJLIIIJL == null || (interfaceC364230EPt = LIZ.get(objLJJLIIIJL)) == null || (viewModelProvider = interfaceC364230EPt.get()) == null) {
            return null;
        }
        return viewModelProvider.get(cls);
    }

    public static String LJ(C364220EPs c364220EPs) {
        String string = UUID.randomUUID().toString();
        LIZ.put(string, c364220EPs);
        LIZJ.push(string);
        LIZIZ = true;
        return string;
    }

    public static BaseViewModel LIZJ(C1DRG c1drg, Class cls) {
        BaseViewModel baseViewModel = (BaseViewModel) LIZLLL(cls);
        if (c1drg != null && baseViewModel != null) {
            baseViewModel.bindDIContainer(c1drg);
        }
        return baseViewModel;
    }
}

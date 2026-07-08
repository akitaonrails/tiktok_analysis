package X;

import android.text.TextWatcher;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457560Hww {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C457560Hww.class, "textWatcherViewModel", "<v#0>", 1);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    public static final void LIZ(UIAssem uIAssem, EditText editText) {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextWatcherViewModel.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 1350), AFwS236S0000000_6.get$arr$(488), null, true);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        Iterator it2 = C13LP.LLIIII(((TextWatcherViewModel) assemVMLazyLIZ.getValue()).LLILZIL).iterator();
        while (it2.hasNext()) {
            editText.addTextChangedListener((TextWatcher) it2.next());
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C457570Hwx(assemVMLazyLIZ, editText, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C457580Hwy(assemVMLazyLIZ, editText, null), 3);
    }
}

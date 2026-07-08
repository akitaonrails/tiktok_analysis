package X;

import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ETR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETR extends AbstractC381020Ewm<C0ET5> implements C0ET5, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LLILLL;
    public final InterfaceC1731706qJ LLILZ;
    public final InterfaceC1731706qJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ETR.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ETR.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    public C0ET5 Z1() {
        return this;
    }

    private final VideoPublishEditModel getEditModel() {
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                return editModel;
            }
        }
        return new VideoPublishEditModel();
    }

    public final void Xi() {
        MutableLiveData mutableLiveDataLIZ;
        o2().aE0(new InterfaceC361900EGu() { // from class: X.0ETS
            @Override // X.InterfaceC361900EGu
            public final void LIZIZ(List<String> list) {
            }

            @Override // X.InterfaceC361900EGu
            public final void LIZ(List<String> list) {
                C0ETR c0etr = this.LIZ;
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    c0etr.X1((String) it2.next());
                }
            }
        });
        C259800zU c259800zU = new C259800zU();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (mutableLiveDataLIZ = c0e48W1.S7().LIZ("event_click_disable_replace_music_with_loop")) == null) {
            return;
        }
        mutableLiveDataLIZ.observe(this, new AObserverS170S0200000_5(this, c259800zU, 3));
    }

    public final Context getContext() {
        return (Context) this.LLILZIL.getValue(this, LLILZLL[1]);
    }

    public final C0EGY o2() {
        return (C0EGY) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        o2().zb0().observe(this, new AObserverS209S0100000_5(this, 42));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public C0ETR(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    }

    public final void X1(String str) {
        InterfaceC359940E9g interfaceC359940E9gAZ0;
        RecyclerView recyclerViewLLII;
        InterfaceC359940E9g interfaceC359940E9gAZ02;
        RecyclerView recyclerViewLLII2;
        if (Intrinsics.LJFF(str, "bottom_item_sound_replace_sound")) {
            if (!C361460EFc.LIZ(getEditModel()) && (interfaceC359940E9gAZ02 = o2().AZ0()) != null && (recyclerViewLLII2 = interfaceC359940E9gAZ02.LLII()) != null) {
                HandlerHook.viewPost(recyclerViewLLII2, new ARunnableS74S0200000_5(recyclerViewLLII2, this, 21));
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "bottom_item_edit_speed") || C361460EFc.LIZ(getEditModel()) || (interfaceC359940E9gAZ0 = o2().AZ0()) == null || (recyclerViewLLII = interfaceC359940E9gAZ0.LLII()) == null) {
            return;
        }
        HandlerHook.viewPost(recyclerViewLLII, new ARunnableS74S0200000_5(recyclerViewLLII, this, 22));
    }
}

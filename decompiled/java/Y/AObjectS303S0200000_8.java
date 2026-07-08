package Y;

import X.C013C;
import X.C1167080gTa;
import X.C11IB;
import X.C11NJ;
import X.C11NZ;
import X.C11QX;
import X.C11RK;
import X.C13LP;
import X.C1462920oAk;
import X.C1624200sMs;
import X.C1647390syH;
import X.C1701890uOB;
import X.C259800zU;
import X.C385670FAf;
import X.C418440Gaw;
import X.C540930LJj;
import X.C577240MkU;
import X.C578510MmX;
import X.C578910MnB;
import X.C579220Mng;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1441305kZ;
import X.InterfaceC1622080sJS;
import X.InterfaceC1647930sz9;
import X.InterfaceC1648020szI;
import X.InterfaceC1648570t0B;
import X.InterfaceC560310LyH;
import X.InterfaceC577400Mkk;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCEffectMessage;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS303S0200000_8 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        C259800zU c259800zU = (C259800zU) aObjectS303S0200000_8.l0;
        Function1 function1 = (Function1) aObjectS303S0200000_8.l1;
        C540930LJj c540930LJj = (C540930LJj) c259800zU.element;
        if (c540930LJj != null) {
            c540930LJj.LJII(function1.invoke(obj));
        }
    }

    public static final void onChanged$1(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        if (!C1462920oAk.LIZJ((View) aObjectS303S0200000_8.l0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aObjectS303S0200000_8.l0).getLayoutParams();
            Activity activity = ((C1167080gTa) aObjectS303S0200000_8.l1).mActivity;
            if (activity != null) {
                marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(activity) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.W5((View) aObjectS303S0200000_8.l0, marginLayoutParams);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public static final void onChanged$2(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C577240MkU) aObjectS303S0200000_8.l0).setEffectContainerVisibility(8);
        } else {
            if (((C577240MkU) aObjectS303S0200000_8.l0).needHideUploadAndEffect() || !Intrinsics.LJFF(((C577240MkU) aObjectS303S0200000_8.l0).getPlanCUIApiComponent().RS().LIZJ(), Boolean.TRUE) || !Intrinsics.LJFF(((InterfaceC577400Mkk) aObjectS303S0200000_8.l1).wd().LIZJ(), Boolean.FALSE)) {
                return;
            }
            ((C577240MkU) aObjectS303S0200000_8.l0).setEffectContainerVisibility(0);
        }
    }

    public static final void onChanged$3(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        C1647390syH c1647390syHLIZJ;
        Object obj2;
        if (((Boolean) obj).booleanValue()) {
            ((C577240MkU) aObjectS303S0200000_8.l0).setUploadVisibility(8);
            ((C577240MkU) aObjectS303S0200000_8.l0).setEffectContainerVisibility(8);
            ((C013C) aObjectS303S0200000_8.l1).element = true;
        } else {
            if (!((C013C) aObjectS303S0200000_8.l1).element) {
                return;
            }
            InterfaceC1647930sz9 interfaceC1647930sz9 = (InterfaceC1647930sz9) ((C577240MkU) aObjectS303S0200000_8.l0).getDiContainer().LJIIL(null, InterfaceC1648020szI.class);
            if (interfaceC1647930sz9 != null && (bottomTabIndexChangeEvent = interfaceC1647930sz9.getBottomTabIndexChangeEvent()) != null && (c1647390syHLIZJ = bottomTabIndexChangeEvent.LIZJ()) != null && (obj2 = c1647390syHLIZJ.LIZIZ) != null && !C13LP.LJJJJ(obj2, ((C577240MkU) aObjectS303S0200000_8.l0).bottomTabAllowList)) {
                return;
            }
            ((C577240MkU) aObjectS303S0200000_8.l0).setUploadVisibility(0);
            ((C577240MkU) aObjectS303S0200000_8.l0).setEffectContainerVisibility(0);
        }
    }

    public static final void onChanged$4(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        if (((C578510MmX) aObjectS303S0200000_8.l0).T2().isEnabled()) {
            ((Function0) aObjectS303S0200000_8.l1).invoke();
        }
    }

    public static final void onChanged$5(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        if (((C578510MmX) aObjectS303S0200000_8.l0).T2().isEnabled()) {
            ((Function0) aObjectS303S0200000_8.l1).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$6(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        CreativeInfo creativeInfo;
        C578910MnB c578910MnB = (C578910MnB) aObjectS303S0200000_8.l0;
        InterfaceC560310LyH interfaceC560310LyH = c578910MnB.LLIZLLLIL;
        AIGCOfflineModel aIGCOfflineModelLJJIJIIJIL = c578910MnB.LJJIJIIJIL((AIGCEffectMessage) aObjectS303S0200000_8.l1);
        ShortVideoContext shortVideoContext = ((C578910MnB) aObjectS303S0200000_8.l0).LLILLJJLI;
        if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
            creativeInfo = new CreativeInfo(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }
        interfaceC560310LyH.XM2(aIGCOfflineModelLJJIJIIJIL, creativeInfo, C1624200sMs.LIZJ(((C578910MnB) aObjectS303S0200000_8.l0).LLJILJILJ));
        ((C578910MnB) aObjectS303S0200000_8.l0).LLILZIL.Vt0().LIZIZ(aObjectS303S0200000_8);
    }

    public static final void onChanged$7(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        C578910MnB c578910MnB = (C578910MnB) aObjectS303S0200000_8.l0;
        InterfaceC1622080sJS interfaceC1622080sJSI2 = ((q) aObjectS303S0200000_8.l1).I2(AFwS239S0000000_8.get$arr$(225));
        if (!(interfaceC1622080sJSI2 instanceof UploadPicStickerARPresenter)) {
            interfaceC1622080sJSI2 = null;
        }
        c578910MnB.LLJJIJI = (UploadPicStickerARPresenter) interfaceC1622080sJSI2;
    }

    public static final void onChanged$8(AObjectS303S0200000_8 aObjectS303S0200000_8, Object obj) {
        long jLongValue;
        C579220Mng c579220Mng = (C579220Mng) aObjectS303S0200000_8.l0;
        if (c579220Mng.LJIJI) {
            long jJu = ((InterfaceC1648570t0B) c579220Mng.LJI.getValue()).Ju();
            if (jJu > 0) {
                jLongValue = Math.min(jJu, ((C579220Mng) aObjectS303S0200000_8.l0).LJ.invoke().longValue());
            } else {
                jLongValue = ((C579220Mng) aObjectS303S0200000_8.l0).LJ.invoke().longValue();
            }
            if (jLongValue > 0) {
                C11IB c11ibLJLJJLL = C11NZ.LJLJJLL(jLongValue, TimeUnit.MILLISECONDS);
                C11RK<Unit> c11rk = ((C579220Mng) aObjectS303S0200000_8.l0).LJIIIZ;
                C1701890uOB.LIZ(c11rk, "other is null");
                ((C11NJ) aObjectS303S0200000_8.l1).LIZ(new C11QX(c11ibLJLJJLL, c11rk).LJJLJLI(new AfS177S0100000_8((C579220Mng) aObjectS303S0200000_8.l0, 89)));
            }
        }
    }

    public AObjectS303S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

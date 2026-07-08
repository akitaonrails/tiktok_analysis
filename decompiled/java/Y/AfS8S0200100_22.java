package Y;

import X.C09JN;
import X.C1389890mGx;
import X.C1412270mr3;
import X.C1427960nGM;
import X.C1428330nGx;
import X.C1C7U;
import X.C2095008Iq;
import X.C371780Ehs;
import X.C385200F8k;
import X.EnumC1288170jct;
import X.EnumC358710E4n;
import X.InterfaceC1452170ntP;
import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;

/* JADX INFO: loaded from: classes23.dex */
public class AfS8S0200100_22 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS8S0200100_22 afS8S0200100_22, Object obj) {
        C1C7U.LIZ("PhotoTemplateScene@59f2.applyTemplate$5");
        NLEModel nLEModel = (NLEModel) obj;
        C385200F8k.LIZJ("PhotoTemplateScene", "applyTemplate succeed");
        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL = ((C1428330nGx) afS8S0200100_22.l0).LLLLLLLZIL();
        if (interfaceC1452170ntPLLLLLLLZIL != null) {
            C371780Ehs.LJIILLIIL(interfaceC1452170ntPLLLLLLLZIL, nLEModel);
        }
        ((C1428330nGx) afS8S0200100_22.l0).LLJL.setValue(new C1427960nGM((PhotoTemplateAsset) afS8S0200100_22.l1, false));
        C1412270mr3 c1412270mr3 = C1412270mr3.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLLLLLL = ((C1428330nGx) afS8S0200100_22.l0).LLLLLLLLLL();
        EnumC1288170jct enumC1288170jct = EnumC1288170jct.SUCCESS;
        int value = EnumC358710E4n.SUCCESS.getValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - afS8S0200100_22.j2;
        PhotoTemplateAsset photoTemplateAsset = (PhotoTemplateAsset) afS8S0200100_22.l1;
        CategoryInfo categoryInfoLLLLLLIL = ((C1428330nGx) afS8S0200100_22.l0).LLLLLLIL();
        c1412270mr3.getClass();
        C1412270mr3.LIZLLL(videoPublishEditModelLLLLLLLLLL, enumC1288170jct, value, "", jCurrentTimeMillis, photoTemplateAsset, categoryInfoLLLLLLIL, false);
        C1C7U.LIZIZ("PhotoTemplateScene@59f2.applyTemplate$5");
    }

    public static final void accept$1(AfS8S0200100_22 afS8S0200100_22, Object obj) {
        Integer numLJIIJJI;
        int value;
        String message;
        C1C7U.LIZ("PhotoTemplateScene@59f2.applyTemplate$6");
        Throwable th = (Throwable) obj;
        C385200F8k.LIZIZ("PhotoTemplateScene", "applyTemplate failed", th);
        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL = ((C1428330nGx) afS8S0200100_22.l0).LLLLLLLZIL();
        if (interfaceC1452170ntPLLLLLLLZIL != null) {
            C371780Ehs.LJIILLIIL(interfaceC1452170ntPLLLLLLLZIL, ((C1428330nGx) afS8S0200100_22.l0).LLLFZ);
        }
        Activity activity = ((C1428330nGx) afS8S0200100_22.l0).mActivity;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131830093);
            c1389890mGx.LJIIJJI();
        }
        Throwable cause = th.getCause();
        if (cause != null && (message = cause.getMessage()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(message);
        } else {
            numLJIIJJI = null;
        }
        C1412270mr3 c1412270mr3 = C1412270mr3.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLLLLLL = ((C1428330nGx) afS8S0200100_22.l0).LLLLLLLLLL();
        EnumC1288170jct enumC1288170jct = EnumC1288170jct.FAILURE;
        if (numLJIIJJI != null) {
            value = numLJIIJJI.intValue();
        } else {
            value = EnumC358710E4n.OTHERS.getValue();
        }
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - afS8S0200100_22.j2;
        PhotoTemplateAsset photoTemplateAsset = (PhotoTemplateAsset) afS8S0200100_22.l1;
        CategoryInfo categoryInfoLLLLLLIL = ((C1428330nGx) afS8S0200100_22.l0).LLLLLLIL();
        c1412270mr3.getClass();
        C1412270mr3.LIZLLL(videoPublishEditModelLLLLLLLLLL, enumC1288170jct, value, message2, jCurrentTimeMillis, photoTemplateAsset, categoryInfoLLLLLLIL, false);
        C1C7U.LIZIZ("PhotoTemplateScene@59f2.applyTemplate$6");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS8S0200100_22(long r2, com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset r4, X.C1428330nGx r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto Lf
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.j2 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS8S0200100_22.<init>(long, com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset, X.0nGx, int):void");
    }
}

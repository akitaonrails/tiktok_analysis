package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0FX6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX6 implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onStart$0(C0FX6 c0fx6, Effect effect) {
    }

    public static final void onStart$1(C0FX6 c0fx6, Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, effect, exceptionResult);
                break;
            case 1:
                onFail$1(this, effect, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        switch (this.$t) {
            case 0:
                onStart$0(this, effect);
                break;
            case 1:
                onStart$1(this, effect);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effect);
                break;
            case 1:
                onSuccess$1(this, effect);
                break;
        }
    }

    public static final void onSuccess$0(C0FX6 c0fx6, Object obj) {
        Effect effect = (Effect) obj;
        ArrayList arrayList = new ArrayList();
        C0FI2 c0fi2 = (C0FI2) c0fx6.l1;
        c0fi2.getClass();
        TextFontStyleData textFontStyleData = null;
        try {
            TextFontStyleData textFontStyleData2 = (TextFontStyleData) C123O.LIZ().LJII(effect.getExtra(), TextFontStyleData.class);
            if (!TextUtils.isEmpty(textFontStyleData2.fileName)) {
                TextFontStyleData textFontStyleDataLIZ = c0fi2.LIZ(textFontStyleData2, effect);
                c0fi2.LJJIJIIJIL(textFontStyleDataLIZ);
                C0FIE c0fie = C196909122h.LIZLLL;
                if (c0fie != null) {
                    c0fie.LIZ(textFontStyleDataLIZ, true, null);
                }
            }
            textFontStyleData = textFontStyleData2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseTextFontStyleData err: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ), e);
        }
        arrayList.add(textFontStyleData);
        ((C0FI2) c0fx6.l1).LJ(Boolean.valueOf(!C298130BmN.LIZ()), arrayList);
        ((C0FI9) c0fx6.l0).onSuccess();
    }

    public static final void onSuccess$1(C0FX6 c0fx6, Object obj) {
        TextFontStyleData textFontStyleDataLJJIJL = ((C0FI2) c0fx6.l1).LJJIJL((Effect) obj);
        C0FID c0fid = (C0FID) c0fx6.l0;
        if (c0fid != null) {
            if (textFontStyleDataLJJIJL != null) {
                c0fid.LIZLLL(textFontStyleDataLJJIJL, true);
            } else {
                c0fid.LIZJ();
            }
        }
    }

    public C0FX6(C0FI2 c0fi2, C0FID c0fid, int i) {
        this.$t = i;
        this.l1 = c0fi2;
        this.l0 = c0fid;
    }

    public static final void onFail$0(C0FX6 c0fx6, Effect effect, ExceptionResult exceptionResult) {
        ((C0FI9) c0fx6.l0).onFail();
    }

    public static final void onFail$1(C0FX6 c0fx6, Effect effect, ExceptionResult exceptionResult) {
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) GsonProtectorUtils.fromJson(C123O.LIZ(), effect.getExtra(), TextFontStyleData.class);
            if (((C0FI2) c0fx6.l1).LIZIZ.get(textFontStyleData.fileName) != null) {
                ((C0FI2) c0fx6.l1).LIZIZ.get(textFontStyleData.fileName).LIZLLL = 2;
            }
            Exception exception = exceptionResult.getException();
            C0FIE c0fie = C196909122h.LIZLLL;
            if (c0fie != null) {
                c0fie.LIZ(textFontStyleData, false, exception);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0FID c0fid = (C0FID) c0fx6.l0;
        if (c0fid != null) {
            c0fid.LIZJ();
        }
        C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textFontDownload err: ");
        sbLIZ.append(exceptionResult.getMsg());
        C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C0FX6(C0FI2 c0fi2, C575920MiM c575920MiM, C056O c056o, int i) {
        this.$t = i;
        this.l1 = c0fi2;
        this.l0 = c575920MiM;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.12Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773512Yb implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onStart$0(C19773512Yb c19773512Yb, Effect effect) {
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

    public static final void onStart$1(C19773512Yb c19773512Yb, Effect effect) {
        ((InterfaceC19568711hF) c19773512Yb.l0).LIZIZ((C19569811hQ) c19773512Yb.l1);
    }

    public static final void onSuccess$0(C19773512Yb c19773512Yb, Object obj) {
        TextFontStyleData textFontStyleDataLJII = ((C196986125g) c19773512Yb.l1).LJII((Effect) obj);
        InterfaceC196996125q interfaceC196996125q = (InterfaceC196996125q) c19773512Yb.l0;
        if (interfaceC196996125q != null) {
            if (textFontStyleDataLJII != null) {
                interfaceC196996125q.LIZ(textFontStyleDataLJII, true);
            } else {
                interfaceC196996125q.LIZJ();
            }
        }
    }

    public static final void onSuccess$1(C19773512Yb c19773512Yb, Object obj) {
        ((InterfaceC19568711hF) c19773512Yb.l0).LIZ((C19569811hQ) c19773512Yb.l1);
    }

    public C19773512Yb(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFail$0(C19773512Yb c19773512Yb, Effect effect, ExceptionResult exceptionResult) {
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) C2346409Hi.LIZ.LJII(effect.getExtra(), TextFontStyleData.class);
            if (((C196986125g) c19773512Yb.l1).LIZ.get(textFontStyleData.fileName) != null) {
                ((C196986125g) c19773512Yb.l1).LIZ.get(textFontStyleData.fileName).LIZIZ = 2;
            }
            exceptionResult.getException();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC196996125q interfaceC196996125q = (InterfaceC196996125q) c19773512Yb.l0;
        if (interfaceC196996125q != null) {
            interfaceC196996125q.LIZJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textFontDownload err: ");
        sbLIZ.append(exceptionResult.getMsg());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onFail$1(C19773512Yb c19773512Yb, Effect effect, ExceptionResult exceptionResult) {
        ((InterfaceC19568711hF) c19773512Yb.l0).LIZJ((C19569811hQ) c19773512Yb.l1);
    }
}

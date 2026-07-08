package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0uID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698190uID implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onFail$2(C1698190uID c1698190uID, Effect effect, ExceptionResult exceptionResult) {
    }

    public static final void onFail$3(C1698190uID c1698190uID, Effect effect, ExceptionResult exceptionResult) {
    }

    public static final void onStart$1(C1698190uID c1698190uID, Effect effect) {
    }

    public static final void onStart$2(C1698190uID c1698190uID, Effect effect) {
    }

    public static final void onStart$3(C1698190uID c1698190uID, Effect effect) {
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
            case 2:
                onFail$2(this, effect, exceptionResult);
                break;
            case 3:
                onFail$3(this, effect, exceptionResult);
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
            case 2:
                onStart$2(this, effect);
                break;
            case 3:
                onStart$3(this, effect);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) throws Exception {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effect);
                break;
            case 1:
                onSuccess$1(this, effect);
                break;
            case 2:
                onSuccess$2(this, effect);
                break;
            case 3:
                onSuccess$3(this, effect);
                break;
        }
    }

    public static final void onStart$0(C1698190uID c1698190uID, Effect effect) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(" start downloading");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("OptionSceneViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onSuccess$0(C1698190uID c1698190uID, Object obj) {
        Boolean boolValueOf;
        EffectManager effectManagerLLJILJILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download successful: ");
        InterfaceC1635410sex interfaceC1635410sex = (InterfaceC1635410sex) c1698190uID.l0;
        if (interfaceC1635410sex != null && (effectManagerLLJILJILJ = interfaceC1635410sex.LLJILJILJ()) != null) {
            boolValueOf = Boolean.valueOf(effectManagerLLJILJILJ.isEffectDownloaded((Effect) c1698190uID.l1));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("OptionSceneViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onSuccess$1(C1698190uID c1698190uID, Object obj) {
        ((Function0) c1698190uID.l0).invoke();
    }

    public static final void onSuccess$2(C1698190uID c1698190uID, Object obj) {
        ((OptionCategoryViewModel) c1698190uID.l0).vQ2((C1643220srY) c1698190uID.l1);
    }

    public static final void onSuccess$3(C1698190uID c1698190uID, Object obj) throws Exception {
        InterfaceC1638010sj9 value;
        Effect effect = (Effect) obj;
        ((C1641680sp4) c1698190uID.l0).LLIZLLLIL.add((ComposerNode) c1698190uID.l1);
        C1641680sp4 c1641680sp4 = (C1641680sp4) c1698190uID.l0;
        InterfaceC1661400tKs interfaceC1661400tKs = c1641680sp4.LLILZIL;
        C1641710sp7 c1641710sp7 = c1641680sp4.LLIZLLLIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1641710sp7, 10));
        for (ComposerNode composerNode : c1641710sp7) {
            String unzipPath = composerNode.effect.getUnzipPath();
            String extra = composerNode.effect.getExtra();
            if (extra == null) {
                extra = "";
            }
            arrayList.add(new ComposerInfo(unzipPath, extra, (String) null, 12));
        }
        interfaceC1661400tKs.L4(arrayList, 20000);
        C1404370meJ c1404370meJN4 = ((C1641680sp4) c1698190uID.l0).LLILZIL.N4();
        String unzipPath2 = effect.getUnzipPath();
        ComposerNode composerNode2 = (ComposerNode) c1698190uID.l1;
        String str = composerNode2.tag_name;
        C1641680sp4 c1641680sp42 = (C1641680sp4) c1698190uID.l0;
        float f = composerNode2.default_value;
        c1641680sp42.getClass();
        c1404370meJN4.LIZIZ(f / 100.0f, unzipPath2, str);
        c1404370meJN4.LIZ();
        C01GW<? extends InterfaceC1638010sj9> c01gw = ((C1641680sp4) c1698190uID.l0).LLJI;
        if (c01gw != null && (value = c01gw.getValue()) != null) {
            ComposerNode composerNode3 = (ComposerNode) c1698190uID.l1;
            C1641680sp4 c1641680sp43 = (C1641680sp4) c1698190uID.l0;
            c1641680sp43.getClass();
            value.LIZJ(new AwS391S0200000_25(c1641680sp43, composerNode3, 410));
        }
    }

    public C1698190uID(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFail$0(C1698190uID c1698190uID, Effect effect, ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fail to download: ");
        sbLIZ.append(exceptionResult.getMsg());
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("OptionSceneViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onFail$1(C1698190uID c1698190uID, Effect effect, ExceptionResult exceptionResult) {
        ((Function1) c1698190uID.l1).invoke(exceptionResult);
    }
}

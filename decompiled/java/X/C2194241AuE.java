package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment$bindNativeGameViewModel$1$4", f = "MiniGameFragment.kt", l = {1467}, m = "invokeSuspend")
public final class C2194241AuE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MiniGameFragment LL;
    public int LLILLJJLI;
    public final /* synthetic */ MiniGameFragment LLILLL;
    public final /* synthetic */ SchemaParserData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194241AuE(MiniGameFragment miniGameFragment, SchemaParserData schemaParserData, InterfaceC1364105Vn<? super C2194241AuE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = miniGameFragment;
        this.LLILZ = schemaParserData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2194241AuE(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MiniGameFragment miniGameFragment;
        String str;
        boolean z;
        String strLJII;
        Object objLJI = obj;
        C1C7U.LIZ("MiniGameFragment@6eb9.bindNativeGameViewModel$1$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                miniGameFragment = this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            Activity activityHS = this.LLILLL.hS();
            if (activityHS != null) {
                SchemaParserData schemaParserData = this.LLILZ;
                miniGameFragment = this.LLILLL;
                C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                if (schemaParserData == null || (str = schemaParserData.clientKey) == null) {
                    str = "";
                }
                MinisPkgConfig minisPkgConfig = miniGameFragment.LLLZI;
                if (miniGameFragment.LLLIIII == EnumC2194261AuG.LOAD_START) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL = miniGameFragment;
                this.LLILLJJLI = 1;
                c2390509Yh.getClass();
                if (!MinisTtmgConfigSettings.LIZ().minisDownloaderNew) {
                    objLJI = true;
                } else if (minisPkgConfig == null) {
                    objLJI = false;
                } else {
                    objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C2144808ak(activityHS, schemaParserData, minisPkgConfig, str, null, z, false));
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("MiniGameFragment@6eb9.bindNativeGameViewModel$1$4");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MiniGameFragment@6eb9.bindNativeGameViewModel$1$4");
            return unit;
        }
        if (((Boolean) objLJI).booleanValue()) {
            SchemaParserData schemaParserData2 = miniGameFragment.LLJJL;
            if (schemaParserData2 != null) {
                strLJII = schemaParserData2.LJII();
            } else {
                strLJII = "__GAME__";
            }
            miniGameFragment.GT(strLJII);
        } else {
            miniGameFragment.uA(EnumC1386450mBP.ERROR_NATIVE_DOWNLAOD_FAILED, 1009, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MiniGameFragment@6eb9.bindNativeGameViewModel$1$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

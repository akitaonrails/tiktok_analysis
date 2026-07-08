package X;

import com.ss.android.ugc.aweme.minis.common.SchemaParserData;

/* JADX INFO: renamed from: X.144c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisVmsdkShipPluginLoader", f = "MinisVmsdkShipPluginLoader.kt", l = {139, 152}, m = "preparePlugins")
public final class C202052144c extends AbstractC23140094w {
    public SchemaParserData LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C202051144b LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202052144c(C202051144b c202051144b, InterfaceC1364105Vn<? super C202052144c> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c202051144b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisVmsdkShipPluginLoader@d5ab.preparePlugins$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZ.LJ(null, null, this);
        C1C7U.LIZIZ("MinisVmsdkShipPluginLoader@d5ab.preparePlugins$1");
        return objLJ;
    }
}

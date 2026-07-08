package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMediaService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS547S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.096R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.core.SmartMovieMediaProcessor$compressMetaAsFlow$1", f = "SmartMovieMediaProcessor.kt", l = {213}, m = "invokeSuspend")
public final class C096R extends C09AX implements Function2<C094D<? super C096Q>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MetaExt LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C096R(MetaExt metaExt, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = metaExt;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C096R c096r = new C096R(this.LLILLL, this.LLILZIL, interfaceC1364105Vn, this.LLILZ);
        c096r.LLILLJJLI = obj;
        return c096r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object c096o;
        int i;
        String str;
        C1C7U.LIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C094D c094d = (C094D) this.LLILLJJLI;
            AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SmartMovieMediaProcessor compressMeta started: path=");
            sbLIZ.append(this.LLILLL.path);
            sbLIZ.append(", isMix=");
            sbLIZ.append(this.LLILZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            anonymousClass0968.getClass();
            AnonymousClass0968.LIZ(logLevel, strLIZIZ);
            C096N c096n = C096N.LIZ;
            String str2 = this.LLILZIL;
            c096n.getClass();
            CreativeInfo creativeInfoLIZJ = C096N.LIZJ(str2);
            if (creativeInfoLIZJ == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SmartMovieMediaProcessor ");
                sbLIZ2.append("Failed to parse creativeInfo from extra");
                AnonymousClass0968.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ2));
                c094d.LJIIIIZZ(new C096P("Failed to parse creativeInfo from extra", -1));
                c094d.LJIIJJI(null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                return unit;
            }
            if (this.LLILLL.path.length() == 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SmartMovieMediaProcessor ");
                sbLIZ3.append("Empty media path");
                AnonymousClass0968.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ3));
                c094d.LJIIIIZZ(new C096P("Empty media path", -1));
                c094d.LJIIJJI(null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                return unit2;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            s sVar = s.LIZ;
            MetaExt metaExt = this.LLILLL;
            String str3 = metaExt.path;
            long j = metaExt.duration;
            sVar.getClass();
            sbLIZ4.append(s.LJIJ(j, str3));
            sbLIZ4.append("_isMix=");
            sbLIZ4.append(this.LLILZ ? 1 : 0);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            MetaExt metaExt2 = this.LLILLL;
            String str4 = metaExt2.path;
            long j2 = metaExt2.duration;
            boolean zIsVideo = metaExt2.isVideo();
            int i3 = metaExt2.width;
            int i4 = metaExt2.height;
            sVar.getClass();
            String strLJIILJJIL = s.LJIILJJIL(str4, j2, zIsVideo, creativeInfoLIZJ, i3, i4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("SmartMovieMediaProcessor compressMeta target path: ");
            sbLIZ5.append(strLJIILJJIL);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
            LogLevel logLevel2 = LogLevel.LEVEL_INFO;
            anonymousClass0968.getClass();
            AnonymousClass0968.LIZ(logLevel2, strLIZIZ3);
            if (C2286708xd.LIZJ(strLJIILJJIL)) {
                ((C369601c6) C096N.LIZIZ.getValue()).LIZJ(strLIZIZ2, strLJIILJJIL);
                c094d.LJIIIIZZ(new C096O(strLJIILJJIL, true));
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("SmartMovieMediaProcessor Hit file cache: ");
                sbLIZ6.append(this.LLILLL.path);
                sbLIZ6.append(", resizePath=");
                sbLIZ6.append(strLJIILJJIL);
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
                LogLevel logLevel3 = LogLevel.LEVEL_INFO;
                anonymousClass0968.getClass();
                AnonymousClass0968.LIZ(logLevel3, strLIZIZ4);
                c094d.LJIIJJI(null);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                return unit3;
            }
            C01GW c01gw = C096N.LIZIZ;
            String strLIZ = ((C369601c6) c01gw.getValue()).LIZ(strLIZIZ2);
            if (C2286708xd.LIZJ(strLIZ)) {
                C2471909mP.LIZJ(strLIZ, strLJIILJJIL);
                if (this.LLILZ) {
                    str = "mix";
                } else {
                    str = "non-mix";
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("SmartMovieMediaProcessor Hit ");
                sbLIZ7.append(str);
                sbLIZ7.append(" cache: key=");
                sbLIZ7.append(strLIZIZ2);
                sbLIZ7.append(", resizePath=");
                sbLIZ7.append(strLJIILJJIL);
                String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ7);
                LogLevel logLevel4 = LogLevel.LEVEL_INFO;
                anonymousClass0968.getClass();
                AnonymousClass0968.LIZ(logLevel4, strLIZIZ5);
                c094d.LJIIIIZZ(new C096O(strLJIILJJIL, true));
                c094d.LJIIJJI(null);
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                return unit4;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.LLILLL.isVideo()) {
                MetaExt metaExt3 = this.LLILLL;
                if (!s.LJJJ(metaExt3.width, metaExt3.height, false, metaExt3.path, 0L)) {
                    C2471909mP.LIZJ(metaExt3.path, strLJIILJJIL);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("SmartMovieMediaProcessor compressMeta: image. FastImportImage cost=");
                    sbLIZ8.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ8);
                    LogLevel logLevel5 = LogLevel.LEVEL_INFO;
                    anonymousClass0968.getClass();
                    AnonymousClass0968.LIZ(logLevel5, strLIZIZ6);
                } else {
                    ITemplateMediaService iTemplateMediaService = (ITemplateMediaService) PluggableExtentionKt.pluggableSpi$default(ITemplateMediaService.class, false, false, false, 14, null);
                    if (iTemplateMediaService != null) {
                        iTemplateMediaService.LIZIZ(C0CHQ.LIZ, metaExt3.path, strLJIILJJIL, C096Y.IMAGE, new C096W(0));
                    }
                    ((C369601c6) c01gw.getValue()).LIZJ(strLIZIZ2, strLJIILJJIL);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("SmartMovieMediaProcessor compressMeta: image. compress cost=");
                    sbLIZ9.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ9);
                    LogLevel logLevel6 = LogLevel.LEVEL_INFO;
                    anonymousClass0968.getClass();
                    AnonymousClass0968.LIZ(logLevel6, strLIZIZ7);
                    z = false;
                }
                if (!C2286708xd.LIZJ(strLJIILJJIL)) {
                    if (z) {
                        i = 1011;
                    } else {
                        i = 1012;
                    }
                    C1417710mzp.LIZ.getClass();
                    c096o = new C096P(C1417710mzp.LJI(metaExt3), i);
                } else {
                    c096o = new C096O(strLJIILJJIL, false);
                }
                c094d.LJIIIIZZ(c096o);
                c094d.LJIIJJI(null);
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                return unit5;
            }
            MetaExt metaExt4 = this.LLILLL;
            if (s.LJJJ(metaExt4.width, metaExt4.height, true, metaExt4.path, metaExt4.duration)) {
                AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(C23250099c.LIZLLL(c094d, C0PEM.LIZJ, null, new C096U(this.LLILLL, strLJIILJJIL, strLIZIZ2, creativeInfoLIZJ, this.LLILZ, jCurrentTimeMillis, c094d, null), 2), 108);
                this.LL = 1;
                if (C23128094k.LIZ(c094d, awS547S0100000_3, this) == objLJFF) {
                    C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                    return objLJFF;
                }
            } else {
                C2471909mP.LIZJ(this.LLILLL.path, strLJIILJJIL);
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("SmartMovieMediaProcessor Video fast import cost: ");
                sbLIZ10.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ10.append("ms");
                String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ10);
                LogLevel logLevel7 = LogLevel.LEVEL_INFO;
                anonymousClass0968.getClass();
                AnonymousClass0968.LIZ(logLevel7, strLIZIZ8);
                if (!C2286708xd.LIZJ(strLJIILJJIL)) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("SmartMovieMediaProcessor ");
                    sbLIZ11.append("Copy video failed");
                    sbLIZ11.append(", path=");
                    sbLIZ11.append(this.LLILLL.path);
                    sbLIZ11.append(", resizePath=");
                    sbLIZ11.append(strLJIILJJIL);
                    AnonymousClass0968.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ11));
                    c094d.LJIIIIZZ(new C096P("Copy video failed", -1));
                    c094d.LJIIJJI(null);
                    Unit unit6 = Unit.LIZ;
                    C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                    return unit6;
                }
                c094d.LJIIIIZZ(new C096O(strLJIILJJIL, false));
                c094d.LJIIJJI(null);
                Unit unit7 = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
                return unit7;
            }
        }
        Unit unit8 = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMetaAsFlow$1");
        return unit8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C096Q> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

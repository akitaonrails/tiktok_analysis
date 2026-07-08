package X;

import android.app.Application;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMediaService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.096T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.core.SmartMovieMediaProcessor$compressVideoWithCallbackFlow$1", f = "SmartMovieMediaProcessor.kt", l = {320}, m = "invokeSuspend")
public final class C096T extends C09AX implements Function2<C094D<? super C096Q>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ MetaExt LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C096T(boolean z, MetaExt metaExt, String str, CreativeInfo creativeInfo, String str2, long j, InterfaceC1364105Vn<? super C096T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = metaExt;
        this.LLILZIL = str;
        this.LLILZLL = creativeInfo;
        this.LLIZ = str2;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C096T c096t = new C096T(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c096t.LLILLJJLI = obj;
        return c096t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SmartMovieMediaProcessor@7e98.compressVideoWithCallbackFlow$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            s sVar = s.LIZ;
            boolean z = this.LLILLL;
            int i3 = (int) this.LLILZ.duration;
            sVar.getClass();
            Pair pairLJIJJ = s.LJIJJ(i3, z);
            int[] iArr = (int[]) pairLJIJJ.getFirst();
            int[] iArr2 = (int[]) pairLJIJJ.getSecond();
            ITemplateMediaService iTemplateMediaService = (ITemplateMediaService) PluggableExtentionKt.pluggableSpi$default(ITemplateMediaService.class, false, false, false, 14, null);
            if (iTemplateMediaService != null) {
                Application application = C0CHQ.LIZ;
                String str = this.LLILZ.path;
                String str2 = this.LLILZIL;
                C096Y c096y = C096Y.VIDEO;
                C096N c096n = C096N.LIZ;
                CreativeInfo creativeInfo = this.LLILZLL;
                c096n.getClass();
                String strLJIIL = s.LJIIL(creativeInfo);
                final MetaExt metaExt = this.LLILZ;
                final String str3 = this.LLIZ;
                final String str4 = this.LLILZIL;
                final long j = this.LLIZLLLIL;
                iTemplateMediaService.LIZIZ(application, str, str2, c096y, new C23177096h(strLJIIL, iArr, iArr2, new InterfaceC352560Dry() { // from class: X.096S
                    @Override // X.InterfaceC352560Dry
                    public final void LIZJ(C352570Drz c352570Drz) {
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void onProgress(float f) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("compressMeta: path=");
                        sbLIZ.append(metaExt.path);
                        sbLIZ.append(", progress=");
                        sbLIZ.append(f);
                        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LIZIZ(String str5, String str6) {
                        C2473009ma c2473009ma = C2473009ma.LIZ;
                        C0VSJ c0vsj = new C0VSJ(str6);
                        c2473009ma.getClass();
                        C2473009ma.LJIIIIZZ(c0vsj);
                        AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
                        LogLevel logLevel = LogLevel.LEVEL_WARNING;
                        anonymousClass0968.getClass();
                        AnonymousClass0968.LIZ(logLevel, "SmartMovieMediaProcessor Video compression cancelled");
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LJJI(String str5, String str6) {
                        String strLJJIFFI = u.LJJIFFI(str6, "//", "/", false);
                        C096N.LIZ.getClass();
                        ((C369601c6) C096N.LIZIZ.getValue()).LIZJ(str3, strLJJIFFI);
                        if (!Intrinsics.LJFF(strLJJIFFI, str4)) {
                            AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SmartMovieMediaProcessor ");
                            sbLIZ.append("Compressed video path != dst resizePath");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            LogLevel logLevel = LogLevel.LEVEL_ERROR;
                            anonymousClass0968.getClass();
                            AnonymousClass0968.LIZ(logLevel, strLIZIZ);
                            c094d.LJIIIIZZ(new C096P("Compressed video path != dst resizePath", 4));
                        } else if (!C2286708xd.LIZJ(strLJJIFFI)) {
                            AnonymousClass0968 anonymousClass09682 = AnonymousClass0968.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("SmartMovieMediaProcessor ");
                            sbLIZ2.append("Compressed video file not found");
                            sbLIZ2.append(", path=");
                            sbLIZ2.append(strLJJIFFI);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            LogLevel logLevel2 = LogLevel.LEVEL_ERROR;
                            anonymousClass09682.getClass();
                            AnonymousClass0968.LIZ(logLevel2, strLIZIZ2);
                            c094d.LJIIIIZZ(new C096P("Compressed video file not found", 1013));
                        } else {
                            AnonymousClass0968 anonymousClass09683 = AnonymousClass0968.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("SmartMovieMediaProcessor Video compression cost: ");
                            sbLIZ3.append(System.currentTimeMillis() - j);
                            sbLIZ3.append("ms");
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            LogLevel logLevel3 = LogLevel.LEVEL_INFO;
                            anonymousClass09683.getClass();
                            AnonymousClass0968.LIZ(logLevel3, strLIZIZ3);
                            c094d.LJIIIIZZ(new C096O(strLJJIFFI, false));
                        }
                        c094d.LJIIJJI(null);
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LIZ(String str5, String str6, String str7) {
                        C2473009ma c2473009ma = C2473009ma.LIZ;
                        C0VSJ c0vsj = new C0VSJ(str6);
                        c2473009ma.getClass();
                        C2473009ma.LJIIIIZZ(c0vsj);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Compress video failed: ");
                        sbLIZ.append(str7);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("SmartMovieMediaProcessor ");
                        sbLIZ2.append(strLIZIZ);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        LogLevel logLevel = LogLevel.LEVEL_ERROR;
                        anonymousClass0968.getClass();
                        AnonymousClass0968.LIZ(logLevel, strLIZIZ2);
                        c094d.LJIIIIZZ(new C096P(strLIZIZ, -1));
                        c094d.LJIIJJI(null);
                    }
                }));
                i = 1;
            } else {
                i = 1;
            }
            this.LL = i;
            if (C23128094k.LIZ(c094d, AFwS189S0000000_3.get$arr$(1330), this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressVideoWithCallbackFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressVideoWithCallbackFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C096Q> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$resolveMedia$2", f = "TemplateMediaChosenHandler.kt", l = {196, 337, 208, 225, 337, 337, 259, 264, 272, 272, 337, 291, 337, 337}, m = "invokeSuspend")
public final class C0L1T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C532520KuY LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C536210L1f LLIZLLLIL;
    public final /* synthetic */ List<MediaModel> LLJ;
    public final /* synthetic */ Intent LLJI;
    public final /* synthetic */ Intent LLJIJIL;
    public final /* synthetic */ CreativeModel LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Function1<String, Unit> LLJILLL;
    public final /* synthetic */ MediaChooseResultListener LLJJ;
    public final /* synthetic */ Function0<Unit> LLJJI;
    public final /* synthetic */ long LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0L1T(C536210L1f c536210L1f, List<? extends MediaModel> list, Intent intent, Intent intent2, CreativeModel creativeModel, String str, Function1<? super String, Unit> function1, MediaChooseResultListener mediaChooseResultListener, Function0<Unit> function0, long j, InterfaceC1364105Vn<? super C0L1T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c536210L1f;
        this.LLJ = list;
        this.LLJI = intent;
        this.LLJIJIL = intent2;
        this.LLJILJIL = creativeModel;
        this.LLJILJILJ = str;
        this.LLJILLL = function1;
        this.LLJJ = mediaChooseResultListener;
        this.LLJJI = function0;
        this.LLJJIII = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L1T c0l1t = new C0L1T(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c0l1t.LLIZ = obj;
        return c0l1t;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0246 A[Catch: all -> 0x0554, CancellationException -> 0x0556, TryCatch #11 {CancellationException -> 0x0556, all -> 0x0554, blocks: (B:6:0x0022, B:16:0x004f, B:33:0x0091, B:35:0x009d, B:37:0x00a7, B:40:0x00b5, B:47:0x00d3, B:59:0x0130, B:61:0x0138, B:86:0x0182, B:89:0x019b, B:99:0x01fa, B:103:0x0203, B:110:0x0238, B:112:0x0246, B:114:0x0269, B:115:0x026e, B:131:0x02c2, B:191:0x041d, B:193:0x0456, B:194:0x045b, B:71:0x015d, B:73:0x0167, B:80:0x0177, B:82:0x017b, B:83:0x017e, B:13:0x0044, B:53:0x00ef, B:96:0x01d1, B:152:0x0336, B:188:0x0416, B:244:0x054e), top: B:269:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a7 A[Catch: all -> 0x0546, CancellationException -> 0x0548, TRY_ENTER, TryCatch #13 {CancellationException -> 0x0548, all -> 0x0546, blocks: (B:8:0x002e, B:14:0x0047, B:30:0x0085, B:31:0x008b, B:38:0x00ad, B:43:0x00bd, B:45:0x00cb, B:48:0x00d6, B:54:0x00f2, B:56:0x010a, B:65:0x0149, B:87:0x0195, B:91:0x01a2, B:97:0x01d4, B:129:0x02a7, B:145:0x02fe, B:147:0x0311, B:169:0x03a9, B:171:0x03be, B:208:0x049a, B:212:0x04a7, B:68:0x0152, B:69:0x0157), top: B:282:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0341 A[Catch: all -> 0x0390, TryCatch #6 {all -> 0x0390, blocks: (B:153:0x0339, B:155:0x0341, B:156:0x0354, B:158:0x035a, B:159:0x0368), top: B:270:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x0554, CancellationException -> 0x0556, TRY_ENTER, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x0556, all -> 0x0554, blocks: (B:6:0x0022, B:16:0x004f, B:33:0x0091, B:35:0x009d, B:37:0x00a7, B:40:0x00b5, B:47:0x00d3, B:59:0x0130, B:61:0x0138, B:86:0x0182, B:89:0x019b, B:99:0x01fa, B:103:0x0203, B:110:0x0238, B:112:0x0246, B:114:0x0269, B:115:0x026e, B:131:0x02c2, B:191:0x041d, B:193:0x0456, B:194:0x045b, B:71:0x015d, B:73:0x0167, B:80:0x0177, B:82:0x017b, B:83:0x017e, B:13:0x0044, B:53:0x00ef, B:96:0x01d1, B:152:0x0336, B:188:0x0416, B:244:0x054e), top: B:269:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x041d A[Catch: all -> 0x0554, CancellationException -> 0x0556, TryCatch #11 {CancellationException -> 0x0556, all -> 0x0554, blocks: (B:6:0x0022, B:16:0x004f, B:33:0x0091, B:35:0x009d, B:37:0x00a7, B:40:0x00b5, B:47:0x00d3, B:59:0x0130, B:61:0x0138, B:86:0x0182, B:89:0x019b, B:99:0x01fa, B:103:0x0203, B:110:0x0238, B:112:0x0246, B:114:0x0269, B:115:0x026e, B:131:0x02c2, B:191:0x041d, B:193:0x0456, B:194:0x045b, B:71:0x015d, B:73:0x0167, B:80:0x0177, B:82:0x017b, B:83:0x017e, B:13:0x0044, B:53:0x00ef, B:96:0x01d1, B:152:0x0336, B:188:0x0416, B:244:0x054e), top: B:269:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x049a A[Catch: all -> 0x0546, CancellationException -> 0x0548, TRY_ENTER, TryCatch #13 {CancellationException -> 0x0548, all -> 0x0546, blocks: (B:8:0x002e, B:14:0x0047, B:30:0x0085, B:31:0x008b, B:38:0x00ad, B:43:0x00bd, B:45:0x00cb, B:48:0x00d6, B:54:0x00f2, B:56:0x010a, B:65:0x0149, B:87:0x0195, B:91:0x01a2, B:97:0x01d4, B:129:0x02a7, B:145:0x02fe, B:147:0x0311, B:169:0x03a9, B:171:0x03be, B:208:0x049a, B:212:0x04a7, B:68:0x0152, B:69:0x0157), top: B:282:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0560 A[Catch: all -> 0x0566, TryCatch #2 {all -> 0x0566, blocks: (B:256:0x0567, B:251:0x0557, B:253:0x0560, B:254:0x0565, B:183:0x03df, B:245:0x0551), top: B:269:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x0546, CancellationException -> 0x0548, TRY_ENTER, TryCatch #13 {CancellationException -> 0x0548, all -> 0x0546, blocks: (B:8:0x002e, B:14:0x0047, B:30:0x0085, B:31:0x008b, B:38:0x00ad, B:43:0x00bd, B:45:0x00cb, B:48:0x00d6, B:54:0x00f2, B:56:0x010a, B:65:0x0149, B:87:0x0195, B:91:0x01a2, B:97:0x01d4, B:129:0x02a7, B:145:0x02fe, B:147:0x0311, B:169:0x03a9, B:171:0x03be, B:208:0x049a, B:212:0x04a7, B:68:0x0152, B:69:0x0157), top: B:282:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152 A[Catch: all -> 0x0546, CancellationException -> 0x0548, TryCatch #13 {CancellationException -> 0x0548, all -> 0x0546, blocks: (B:8:0x002e, B:14:0x0047, B:30:0x0085, B:31:0x008b, B:38:0x00ad, B:43:0x00bd, B:45:0x00cb, B:48:0x00d6, B:54:0x00f2, B:56:0x010a, B:65:0x0149, B:87:0x0195, B:91:0x01a2, B:97:0x01d4, B:129:0x02a7, B:145:0x02fe, B:147:0x0311, B:169:0x03a9, B:171:0x03be, B:208:0x049a, B:212:0x04a7, B:68:0x0152, B:69:0x0157), top: B:282:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[Catch: all -> 0x0554, CancellationException -> 0x0556, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x0556, all -> 0x0554, blocks: (B:6:0x0022, B:16:0x004f, B:33:0x0091, B:35:0x009d, B:37:0x00a7, B:40:0x00b5, B:47:0x00d3, B:59:0x0130, B:61:0x0138, B:86:0x0182, B:89:0x019b, B:99:0x01fa, B:103:0x0203, B:110:0x0238, B:112:0x0246, B:114:0x0269, B:115:0x026e, B:131:0x02c2, B:191:0x041d, B:193:0x0456, B:194:0x045b, B:71:0x015d, B:73:0x0167, B:80:0x0177, B:82:0x017b, B:83:0x017e, B:13:0x0044, B:53:0x00ef, B:96:0x01d1, B:152:0x0336, B:188:0x0416, B:244:0x054e), top: B:269:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b A[Catch: all -> 0x0554, CancellationException -> 0x0556, TRY_ENTER, TryCatch #11 {CancellationException -> 0x0556, all -> 0x0554, blocks: (B:6:0x0022, B:16:0x004f, B:33:0x0091, B:35:0x009d, B:37:0x00a7, B:40:0x00b5, B:47:0x00d3, B:59:0x0130, B:61:0x0138, B:86:0x0182, B:89:0x019b, B:99:0x01fa, B:103:0x0203, B:110:0x0238, B:112:0x0246, B:114:0x0269, B:115:0x026e, B:131:0x02c2, B:191:0x041d, B:193:0x0456, B:194:0x045b, B:71:0x015d, B:73:0x0167, B:80:0x0177, B:82:0x017b, B:83:0x017e, B:13:0x0044, B:53:0x00ef, B:96:0x01d1, B:152:0x0336, B:188:0x0416, B:244:0x054e), top: B:269:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[Catch: all -> 0x0554, CancellationException -> 0x0556, TRY_ENTER, TryCatch #11 {CancellationException -> 0x0556, all -> 0x0554, blocks: (B:6:0x0022, B:16:0x004f, B:33:0x0091, B:35:0x009d, B:37:0x00a7, B:40:0x00b5, B:47:0x00d3, B:59:0x0130, B:61:0x0138, B:86:0x0182, B:89:0x019b, B:99:0x01fa, B:103:0x0203, B:110:0x0238, B:112:0x0246, B:114:0x0269, B:115:0x026e, B:131:0x02c2, B:191:0x041d, B:193:0x0456, B:194:0x045b, B:71:0x015d, B:73:0x0167, B:80:0x0177, B:82:0x017b, B:83:0x017e, B:13:0x0044, B:53:0x00ef, B:96:0x01d1, B:152:0x0336, B:188:0x0416, B:244:0x054e), top: B:269:0x0017 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L1T.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator$uploadImageAndGenerateSocialAvatar$1", f = "SocialAvatarGenerator.kt", l = {699, 715, 726, 746}, m = "invokeSuspend")
public final class C0HKP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<EnumC439250HKh, Unit> LLILZIL;
    public final /* synthetic */ C0HL8 LLILZLL;
    public final /* synthetic */ Function1<EnumC439270HKj, Unit> LLIZ;
    public final /* synthetic */ Function1<List<DMUploadImageResult>, Unit> LLIZLLLIL;
    public final /* synthetic */ InterfaceC497601wk LLJ;
    public final /* synthetic */ double LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Function2<EnumC439280HKk, C0HKO, Unit> LLJILJIL;
    public final /* synthetic */ Function1<EnumC439240HKg, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HKP(String str, String str2, Function1<? super EnumC439250HKh, Unit> function1, C0HL8 c0hl8, Function1<? super EnumC439270HKj, Unit> function12, Function1<? super List<DMUploadImageResult>, Unit> function13, InterfaceC497601wk interfaceC497601wk, double d, String str3, Function2<? super EnumC439280HKk, ? super C0HKO, Unit> function2, Function1<? super EnumC439240HKg, Unit> function14, InterfaceC1364105Vn<? super C0HKP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function1;
        this.LLILZLL = c0hl8;
        this.LLIZ = function12;
        this.LLIZLLLIL = function13;
        this.LLJ = interfaceC497601wk;
        this.LLJI = d;
        this.LLJIJIL = str3;
        this.LLJILJIL = function2;
        this.LLJILJILJ = function14;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HKP(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[Catch: 094W -> 0x00c3, 0HKQ -> 0x00d6, Exception -> 0x00ed, TRY_ENTER, TryCatch #5 {094W -> 0x00c3, 0HKQ -> 0x00d6, Exception -> 0x00ed, blocks: (B:42:0x00bd, B:43:0x00c0, B:32:0x0094, B:34:0x009e, B:36:0x00a2, B:37:0x00a6), top: B:76:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HKP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS0S6710000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0auT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953110auT extends C09AY implements InterfaceC2280191EMv<String, String, EnumC937290aUx, EnumC953330aup, String, C917840Zza, EnumC952890au7, String, C916750Zxp, Unit> {
    public final /* synthetic */ WeakReference<InterfaceC917550Zz7> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953110auT(WeakReference<InterfaceC917550Zz7> weakReference, boolean z, boolean z2, String str, Long l, String str2) {
        super(9);
        this.LL = weakReference;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = l;
        this.LLILZLL = str2;
    }

    @Override // X.InterfaceC2280191EMv
    public final Unit os(String str, String str2, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str3, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, String str4, C916750Zxp c916750Zxp) {
        boolean z;
        int i;
        Boolean boolValueOf;
        int i2;
        InterfaceC917550Zz7 interfaceC917550Zz7;
        InterfaceC917550Zz7 interfaceC917550Zz72;
        String str5 = str;
        String str6 = str2;
        EnumC937290aUx enumC937290aUx2 = enumC937290aUx;
        EnumC953330aup enumC953330aup2 = enumC953330aup;
        String str7 = str3;
        C917840Zza c917840Zza2 = c917840Zza;
        EnumC952890au7 enumC952890au72 = enumC952890au7;
        String str8 = str4;
        C916750Zxp c916750Zxp2 = c916750Zxp;
        if (str6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && c916750Zxp2.LIZIZ <= 0) {
            WeakReference<InterfaceC917550Zz7> weakReference = this.LL;
            if (weakReference != null && (interfaceC917550Zz72 = weakReference.get()) != null) {
                interfaceC917550Zz72.LJ(c916750Zxp2, EnumC953170auZ.SAVE_FAIL, null);
            }
        } else {
            WeakReference<InterfaceC917550Zz7> weakReference2 = this.LL;
            if (weakReference2 != null && (interfaceC917550Zz7 = weakReference2.get()) != null) {
                interfaceC917550Zz7.LIZJ(c916750Zxp2, str5);
            }
            if (this.LLILLJJLI) {
                C953230auf.LIZ.getClass();
                if (!C953230auf.LJIIJJI()) {
                    C953610avH.LJJI.getClass();
                    if (Intrinsics.LJFF(str6, C953610avH.LJJII)) {
                        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                            i2 = 2131853990;
                        } else {
                            i2 = 2131853989;
                        }
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(i2));
                    } else {
                        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                            i = 2131853962;
                        } else {
                            i = 2131853961;
                        }
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
                        InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
                        if (interfaceC945610aiNLIZ != null) {
                            boolValueOf = Boolean.valueOf(interfaceC945610aiNLIZ.LJIIIIZZ());
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf)) {
                            if (this.LLILLL) {
                                C953620avI.LIZLLL(LIZ(str6, enumC937290aUx2, enumC953330aup2, str7, this.LL, c917840Zza2, enumC952890au72, c916750Zxp2, str8, this.LLILZ, this.LLILZIL, this.LLILZLL, str5, ""));
                            } else {
                                C953620avI.LJIIJJI(LIZ(str6, enumC937290aUx2, enumC953330aup2, str7, this.LL, c917840Zza2, enumC952890au72, c916750Zxp2, str8, this.LLILZ, this.LLILZIL, this.LLILZLL, str5, ""), null);
                            }
                        } else {
                            C953370aut.LIZLLL(str5, new AwS0S6710000_15((WeakReference) this.LL, (WeakReference<InterfaceC917550Zz7>) c916750Zxp2, (C916750Zxp) this.LLILLL, (boolean) str6, (String) enumC937290aUx2, (EnumC937290aUx) enumC953330aup2, (EnumC953330aup) str7, (String) c917840Zza2, (C917840Zza) enumC952890au72, (EnumC952890au7) str8, this.LLILZ, (String) this.LLILZIL, (Long) this.LLILZLL, str5, (String) 0));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final C953600avG LIZ(String str, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str2, WeakReference<InterfaceC917550Zz7> weakReference, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, String str3, String str4, Long l, String str5, String str6, String str7) {
        return new C953600avG(str, str7, enumC937290aUx, enumC953330aup, str2, weakReference, c917840Zza, enumC952890au7, Long.valueOf(c916750Zxp.LIZIZ), str3, new C334801Rq(str4, l, str5), c916750Zxp.LIZ, str6, null, 8192);
    }
}

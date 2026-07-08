package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.1014, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AnonymousClass1014 implements InterfaceC722440SVm<C0SVS> {
    public final Context LIZ;
    public final AnonymousClass1012 LIZIZ;
    public final AnonymousClass1015 LIZJ = new InterfaceC722470SVp<C0SVS>() { // from class: X.1015
        @Override // X.InterfaceC722470SVp
        public final C07XH LIZ() {
            C722300SUy c722300SUy = new C722300SUy(C1308910kAL.LIZJ(R.attr.a1h, this.LIZ.LIZ), 0, R.raw.icon_shield_tick_fill, 5);
            AnonymousClass1014 anonymousClass1014 = this.LIZ;
            return new C0SVS(c722300SUy, anonymousClass1014.LIZ.getString(anonymousClass1014.LIZIZ.LIZ), new C0SVT(C0SXM.COLOR.ordinal(), 0, C1308910kAL.LIZJ(R.attr.c7, this.LIZ.LIZ), 2), new C722300SUy(C1308910kAL.LIZJ(R.attr.a1h, this.LIZ.LIZ), 0, R.raw.icon_chevron_right_ltr, 5), new AnonymousClass1011(this.LIZ));
        }
    };
    public final C722360SVe LIZLLL;
    public final AnonymousClass1013 LJ;

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C0SVS>> LIZIZ() {
        return C0SVR.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVS> LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C0SVR(this.LIZ, (C0SVS) c07xh, interfaceC722440SVm);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1015] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1013] */
    public AnonymousClass1014(Context context, Aweme aweme, String str, final AFwS198S0000000_11 aFwS198S0000000_11, AnonymousClass1012 anonymousClass1012) {
        this.LIZ = context;
        this.LIZIZ = anonymousClass1012;
        String str2 = anonymousClass1012.LIZJ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("item_id", aweme.getAid());
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        this.LIZLLL = new C722360SVe("comment_header", str2, C2097608Jq.LJIIIIZZ(pairArr));
        this.LJ = new C0SVZ() { // from class: X.1013
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                Function0<Unit> function0 = this.LIZ.LIZIZ.LIZLLL;
                if (function0 != null) {
                    function0.invoke();
                }
                Function0<Unit> function02 = aFwS198S0000000_11;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
    }
}

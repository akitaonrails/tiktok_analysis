package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722330SVb implements InterfaceC722440SVm<C0SVX> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C722340SVc LIZJ;
    public final C722360SVe LIZLLL;

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVX> LJ() {
        return new InterfaceC722470SVp<C0SVX>() { // from class: X.0SVa
            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                return new C0SVX(new C0SVT(C0SXM.IMAGE.ordinal(), R.drawable.ffv, null, 4), new C722300SUy(C1308910kAL.LIZJ(R.attr.ef, this.LIZ.LIZ), C0SV1.LOCAL.ordinal(), R.raw.icon_eye_slash, 4), 6);
            }
        };
    }

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C0SVX>> LIZIZ() {
        return C0SVW.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C0SVW(this.LIZ, (C0SVX) c07xh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SVc] */
    public C722330SVb(Context context, Aweme aweme, String str, final Function0<Unit> function0) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = new C0SVZ() { // from class: X.0SVc
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                function0.invoke();
            }
        };
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("item_id", aweme.getAid());
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        this.LIZLLL = new C722360SVe("card_mask", "report", C2097608Jq.LJIIIIZZ(pairArr));
    }
}

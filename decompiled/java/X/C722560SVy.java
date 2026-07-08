package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722560SVy implements InterfaceC722440SVm<C0SVX> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C0SW0 LIZJ;
    public final C722360SVe LIZLLL;

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVX> LJ() {
        return new InterfaceC722470SVp<C0SVX>() { // from class: X.0SVx
            public final Aweme LIZ;

            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                JSONObject jSONObject;
                String coverNotice = AwemeExtKt.getCoverNotice(this.LIZ);
                C722560SVy c722560SVy = this.LIZIZ;
                if (coverNotice.length() == 0) {
                    c722560SVy.getClass();
                    try {
                        jSONObject = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("type", "cover_notice"), new Pair("log_id", c722560SVy.LIZIZ.getRequestId()), new Pair("item_id", c722560SVy.LIZIZ.getAid())));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        jSONObject = new JSONObject();
                    }
                    C793770VBv.LJ("notice_content_empty", jSONObject);
                    coverNotice = c722560SVy.LIZ.getString(2131829600);
                }
                return new C0SVX(new C0SVT(C0SXM.COLOR.ordinal(), 0, C1308910kAL.LIZJ(R.attr.a1_, this.LIZIZ.LIZ), 2), coverNotice, 73, null);
            }

            {
                this.LIZ = this.LIZIZ.LIZIZ;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SW0] */
    public C722560SVy(Context context, Aweme aweme, String str, final Function0<Unit> function0) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = new C0SVZ() { // from class: X.0SW0
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
        this.LIZLLL = new C722360SVe("card_mask", "prohibit", C2097608Jq.LJIIIIZZ(pairArr));
    }
}

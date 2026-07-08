package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.101j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191789101j implements InterfaceC722440SVm<C07XI> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final C191794101o LJFF = new C0SVZ() { // from class: X.101o
        @Override // X.C0SVZ
        public final void LIZIZ() {
        }

        @Override // X.C0SVZ
        public final void LIZ() {
            this.LIZ.LIZLLL.invoke();
        }
    };

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        String str = this.LIZJ;
        if (str == null) {
            str = "";
        }
        String aid = this.LIZIZ.getAid();
        return new C722360SVe(str, "stop_autoplay_mask", C2097908Jt.LIZJ(new Pair("item_id", aid != null ? aid : "")));
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C07XI> LJ() {
        return new InterfaceC722470SVp<C07XI>() { // from class: X.101i
            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                return new C07XI(new C191784101e(this.LIZ.LIZ.getString(2131834545), "replay_video", EnumC191783101d.PRIMARY, new C191790101k(this.LIZ), Integer.valueOf(R.attr.zj), Float.valueOf(0.8f), Integer.valueOf(R.raw.icon_replay_fill), false));
            }
        };
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C07XI>> LIZIZ() {
        return C191787101h.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C191787101h(this.LIZ, (C07XI) c07xh, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.101o] */
    public C191789101j(Context context, Aweme aweme, String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = awS555S0100000_11;
        this.LJ = awS555S0100000_112;
    }
}

package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SVV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVV implements InterfaceC722440SVm<C0SVS> {
    public final Context LIZ;
    public final AnonymousClass1016 LIZIZ = new InterfaceC722470SVp<C0SVS>() { // from class: X.1016
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC722470SVp
        public final C07XH LIZ() {
            C722300SUy c722300SUy = new C722300SUy(C1308910kAL.LIZJ(R.attr.a1k, this.LIZ.LIZ), 0, R.raw.icon_chat_xmark, 5);
            C0SVV c0svv = this.LIZ;
            c0svv.getClass();
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ(2131839134);
            c444940Hca.LJIIIIZZ = new AwS555S0100000_11(c0svv, 1377);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(62);
            c444940Hca.LIZLLL(5);
            CharSequence charSequenceLIZJ = C20588115hH.LIZJ(c0svv.LIZ, 2131839129, c444940Hca.LIZ(c0svv.LIZ));
            if (charSequenceLIZJ == null) {
                Context context = c0svv.LIZ;
                charSequenceLIZJ = context.getString(2131839129, context.getString(2131839134));
            }
            return new C0SVS(c722300SUy, charSequenceLIZJ, new C0SVT(0, 0, C1308910kAL.LIZJ(R.attr.zr, this.LIZ.LIZ), 3), null, null);
        }
    };
    public final C722360SVe LIZJ = new C722360SVe();

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return null;
    }

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<C0SVU> LIZIZ() {
        return C0SVU.class;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVS> LJ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1016] */
    public C0SVV(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C0SVU(this.LIZ, (C0SVS) c07xh, interfaceC722440SVm);
    }
}

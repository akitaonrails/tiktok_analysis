package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import java.util.List;

/* JADX INFO: renamed from: X.0ZbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902920ZbW {
    public final C903590Zcb LIZ;
    public final List<IMessageEventProtocol> LIZIZ;
    public final C902930ZbX LIZJ;

    public C902920ZbW() {
        this((C903590Zcb) null, (List) null, 7);
    }

    public final C902920ZbW LIZIZ(List<? extends IMessageEventProtocol> list) {
        return LIZ(this, null, C13LP.LJLIL(list, this.LIZIZ), null, 5);
    }

    public final C902920ZbW LIZJ(C903590Zcb c903590Zcb) {
        C903590Zcb c903590Zcb2 = this.LIZ;
        if (c903590Zcb2 != null) {
            c903590Zcb = c903590Zcb2.LIZ(c903590Zcb);
        }
        return LIZ(this, c903590Zcb, null, null, 6);
    }

    public final C902920ZbW LIZLLL(C902920ZbW c902920ZbW) {
        C903590Zcb c903590ZcbLIZ;
        if (c902920ZbW == null) {
            return this;
        }
        C903590Zcb c903590Zcb = this.LIZ;
        if (c903590Zcb != null) {
            c903590ZcbLIZ = c903590Zcb.LIZ(c902920ZbW.LIZ);
        } else {
            c903590ZcbLIZ = c902920ZbW.LIZ;
        }
        List listLJLIL = C13LP.LJLIL(c902920ZbW.LIZIZ, this.LIZIZ);
        C902930ZbX c902930ZbX = this.LIZJ;
        C902930ZbX c902930ZbX2 = c902920ZbW.LIZJ;
        if (c902930ZbX != null) {
            if (c902930ZbX2 != null) {
                AbstractC21673719rz abstractC21673719rz = c902930ZbX2.LIZ;
                if (abstractC21673719rz == null) {
                    abstractC21673719rz = c902930ZbX.LIZ;
                }
                c902930ZbX = new C902930ZbX(abstractC21673719rz, (List<? extends C0DXR>) C13LP.LJLIL(c902930ZbX2.LIZIZ, c902930ZbX.LIZIZ));
            }
            c902930ZbX2 = c902930ZbX;
        }
        return new C902920ZbW(c903590ZcbLIZ, (List<? extends IMessageEventProtocol>) listLJLIL, c902930ZbX2);
    }

    public C902920ZbW(C903590Zcb c903590Zcb, List list, int i) {
        this((i & 1) != 0 ? null : c903590Zcb, (List<? extends IMessageEventProtocol>) ((i & 2) != 0 ? C13BV.INSTANCE : list), (C902930ZbX) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C902920ZbW(C903590Zcb c903590Zcb, List<? extends IMessageEventProtocol> list, C902930ZbX c902930ZbX) {
        this.LIZ = c903590Zcb;
        this.LIZIZ = list;
        this.LIZJ = c902930ZbX;
    }

    public static C902920ZbW LIZ(C902920ZbW c902920ZbW, C903590Zcb c903590Zcb, List list, C902930ZbX c902930ZbX, int i) {
        if ((i & 1) != 0) {
            c903590Zcb = c902920ZbW.LIZ;
        }
        if ((i & 2) != 0) {
            list = c902920ZbW.LIZIZ;
        }
        if ((i & 4) != 0) {
            c902930ZbX = c902920ZbW.LIZJ;
        }
        c902920ZbW.getClass();
        return new C902920ZbW(c903590Zcb, (List<? extends IMessageEventProtocol>) list, c902930ZbX);
    }
}

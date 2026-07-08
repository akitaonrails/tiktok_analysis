package Y;

import X.C11BN;
import X.C123100dR;
import X.C1417220mz2;
import X.C1419240n2I;
import X.C1664680tQA;
import X.C19530011b0;
import X.C19530611b6;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC1441305kZ;
import X.InterfaceC1453200nv4;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AObjectS307S0200000_29 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public static final void onChanged$0(AObjectS307S0200000_29 aObjectS307S0200000_29, Object obj) {
        ((C259800zU) aObjectS307S0200000_29.l0).element = ((C19530611b6) aObjectS307S0200000_29.l1).K6().creativeModel.autoCutModel.curTemplateId;
        C1419240n2I.LIZ((C19530611b6) aObjectS307S0200000_29.l1, true, false, false, "auto_cut", false, 22);
    }

    public static final void onChanged$1(AObjectS307S0200000_29 aObjectS307S0200000_29, Object obj) {
        if (C1417220mz2.LIZ(((C19530611b6) aObjectS307S0200000_29.l0).K6())) {
            if (!Intrinsics.LJFF(((C259800zU) aObjectS307S0200000_29.l1).element, ((C19530611b6) aObjectS307S0200000_29.l0).K6().creativeModel.autoCutModel.curTemplateId)) {
                C1419240n2I.LIZ((C19530611b6) aObjectS307S0200000_29.l0, true, false, false, null, false, 30);
                return;
            } else {
                ((C19530611b6) aObjectS307S0200000_29.l0).da();
                return;
            }
        }
        C1419240n2I.LIZ((C19530611b6) aObjectS307S0200000_29.l0, true, false, false, null, false, 30);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public static final void onChanged$2(AObjectS307S0200000_29 aObjectS307S0200000_29, Object obj) {
        AVMusic aVMusicLJI;
        LiveEvent<AVMusic> liveEventB7;
        ((C259800zU) aObjectS307S0200000_29.l0).element = ((C19530011b0) aObjectS307S0200000_29.l1).LJJJLIIL().creativeModel.autoCutModel.curTemplateId;
        if (C1417220mz2.LIZ(((C19530011b0) aObjectS307S0200000_29.l1).LJJJLIIL()) && ((C19530011b0) aObjectS307S0200000_29.l1).Ye2()) {
            InterfaceC1453200nv4 interfaceC1453200nv4G2 = ((C19530011b0) aObjectS307S0200000_29.l1).G2();
            if (interfaceC1453200nv4G2 != null && (liveEventB7 = interfaceC1453200nv4G2.b7()) != null) {
                aVMusicLJI = liveEventB7.LJI();
            } else {
                aVMusicLJI = null;
            }
            Function1<? super AVMusic, Unit> function1 = ((C19530011b0) aObjectS307S0200000_29.l1).LLJJIII;
            if (function1 != null) {
                function1.invoke(aVMusicLJI);
            }
            ((C19530011b0) aObjectS307S0200000_29.l1).H3();
        }
    }

    public static final void onChanged$3(AObjectS307S0200000_29 aObjectS307S0200000_29, Object obj) {
        LiveEvent<AVMusic> liveEventB7;
        LiveEvent<AVMusic> liveEventB72;
        AVMusic aVMusicLJI = null;
        if (C1417220mz2.LIZ(((C19530011b0) aObjectS307S0200000_29.l0).LJJJLIIL())) {
            if (((C19530011b0) aObjectS307S0200000_29.l0).LJJJLIIL().isCurrentAutoCutMode() && !Intrinsics.LJFF(((C259800zU) aObjectS307S0200000_29.l1).element, ((C19530011b0) aObjectS307S0200000_29.l0).LJJJLIIL().creativeModel.autoCutModel.curTemplateId)) {
                InterfaceC1453200nv4 interfaceC1453200nv4G2 = ((C19530011b0) aObjectS307S0200000_29.l0).G2();
                if (interfaceC1453200nv4G2 != null && (liveEventB72 = interfaceC1453200nv4G2.b7()) != null) {
                    aVMusicLJI = liveEventB72.LJI();
                }
                Function1<? super AVMusic, Unit> function1 = ((C19530011b0) aObjectS307S0200000_29.l0).LLJJIII;
                if (function1 != null) {
                    function1.invoke(aVMusicLJI);
                }
                ((C19530011b0) aObjectS307S0200000_29.l0).H3();
                return;
            }
            return;
        }
        InterfaceC1453200nv4 interfaceC1453200nv4G22 = ((C19530011b0) aObjectS307S0200000_29.l0).G2();
        if (interfaceC1453200nv4G22 != null && (liveEventB7 = interfaceC1453200nv4G22.b7()) != null) {
            aVMusicLJI = liveEventB7.LJI();
        }
        Function1<? super AVMusic, Unit> function12 = ((C19530011b0) aObjectS307S0200000_29.l0).LLJJIII;
        if (function12 != null) {
            function12.invoke(aVMusicLJI);
        }
        ((C19530011b0) aObjectS307S0200000_29.l0).H3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$4(AObjectS307S0200000_29 aObjectS307S0200000_29, Object obj) {
        String str = (String) obj;
        if ((str == null || str.length() == 0) && !((SecretRepliesStickerModel) ((C1664680tQA) aObjectS307S0200000_29.l0).LIZ).getEditable()) {
            C786410Ut5.LLLLLZL(((C11BN) aObjectS307S0200000_29.l1).getSecretReplyQuestionEditText(), 8);
            return;
        }
        if (C123100dR.LIZ(str)) {
            ((C11BN) aObjectS307S0200000_29.l1).getSecretReplyQuestionEditText().setText(str);
        }
        C786410Ut5.LLLLLZL(((C11BN) aObjectS307S0200000_29.l1).getSecretReplyQuestionEditText(), 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS307S0200000_29(X.C19530011b0 r2, X.C259800zU r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 2 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS307S0200000_29.<init>(X.11b0, X.00zU, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS307S0200000_29(X.C19530611b6 r2, X.C259800zU r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS307S0200000_29.<init>(X.11b6, X.00zU, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS307S0200000_29(C1664680tQA c1664680tQA, C1664680tQA<SecretRepliesStickerModel> c1664680tQA2, C11BN c11bn) {
        this.$t = c11bn;
        this.l0 = c1664680tQA;
        this.l1 = c1664680tQA2;
    }
}

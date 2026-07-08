package Y;

import X.C09JN;
import X.C0OPX;
import X.C0OSZ;
import X.C1C7U;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiActionResponse;

/* JADX INFO: loaded from: classes10.dex */
public class AfS1S1201200_9 implements C09JN {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S1201200_9 afS1S1201200_9, Object obj) {
        C1C7U.LIZ("BulletinEmojiRepository@b433._operator$1$postEmojiAction$1");
        BulletinEmojiActionResponse bulletinEmojiActionResponse = (BulletinEmojiActionResponse) obj;
        Integer num = bulletinEmojiActionResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            C0OSZ c0osz = (C0OSZ) afS1S1201200_9.l1;
            if (c0osz != null) {
                c0osz.LIZIZ();
            }
        } else {
            C0OSZ c0osz2 = (C0OSZ) afS1S1201200_9.l1;
            if (c0osz2 != null) {
                c0osz2.LIZ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post emoji action bbId: {");
            sbLIZ.append(afS1S1201200_9.j4);
            sbLIZ.append("}, bbItemId: {");
            sbLIZ.append(afS1S1201200_9.j5);
            sbLIZ.append("}, emoji: {");
            sbLIZ.append(afS1S1201200_9.s0);
            sbLIZ.append("}, type: {");
            sbLIZ.append(afS1S1201200_9.i3);
            sbLIZ.append("}, identityType: {");
            sbLIZ.append((Integer) afS1S1201200_9.l2);
            sbLIZ.append("} error statusCode:");
            sbLIZ.append(bulletinEmojiActionResponse.statusCode);
            sbLIZ.append(", statusMsg: ");
            sbLIZ.append(bulletinEmojiActionResponse.statusMsg);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("BulletinEmojiRepository@b433._operator$1$postEmojiAction$1");
    }

    public static final void accept$1(AfS1S1201200_9 afS1S1201200_9, Object obj) {
        C1C7U.LIZ("BulletinEmojiRepository@b433._operator$1$postEmojiAction$2");
        Throwable th = (Throwable) obj;
        C0OSZ c0osz = (C0OSZ) afS1S1201200_9.l1;
        if (c0osz != null) {
            c0osz.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post emoji action bbId: {");
        sbLIZ.append(afS1S1201200_9.j4);
        sbLIZ.append("}, bbItemId: {");
        sbLIZ.append(afS1S1201200_9.j5);
        sbLIZ.append("}, emoji: {");
        sbLIZ.append(afS1S1201200_9.s0);
        sbLIZ.append("}, type: {");
        sbLIZ.append(afS1S1201200_9.i3);
        sbLIZ.append("}, identityType: {");
        sbLIZ.append((Integer) afS1S1201200_9.l2);
        sbLIZ.append("}, error:");
        sbLIZ.append(th.getMessage());
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("BulletinEmojiRepository@b433._operator$1$postEmojiAction$2");
    }

    public AfS1S1201200_9(int i, long j, long j2, C0OSZ c0osz, Integer num, String str, int i2) {
        this.$t = i2;
        this.l1 = c0osz;
        this.j4 = j;
        this.j5 = j2;
        this.s0 = str;
        this.i3 = i;
        this.l2 = num;
    }
}

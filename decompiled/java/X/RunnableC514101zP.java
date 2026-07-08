package X;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol;

/* JADX INFO: renamed from: X.01zP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514101zP implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TuxTextView tuxTextViewLJLILLLLZI;
        TextPaint paint;
        String strLIZIZ;
        TextPaint paint2;
        TuxTextView tuxTextViewLJLILLLLZI2 = ((ProfileInfoNicknameProtocol) this.l1).LJLILLLLZI();
        if (tuxTextViewLJLILLLLZI2 == null || tuxTextViewLJLILLLLZI2.getLineCount() <= 1 || (tuxTextViewLJLILLLLZI = ((ProfileInfoNicknameProtocol) this.l1).LJLILLLLZI()) == null || (paint = tuxTextViewLJLILLLLZI.getPaint()) == null) {
            return;
        }
        float fMeasureText = paint.measureText(this.s0);
        if (((ProfileInfoNicknameProtocol) this.l1).LJLILLLLZI() != null) {
            float width = (r0.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / fMeasureText;
            int length = (int) ((this.s0.length() * width) - 3);
            if (length <= 0 || width >= 1.0f) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) this.s0.subSequence(0, 1));
                sbLIZ.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                TuxTextView tuxTextViewLJLILLLLZI3 = ((ProfileInfoNicknameProtocol) this.l1).LJLILLLLZI();
                if (tuxTextViewLJLILLLLZI3 == null || (paint2 = tuxTextViewLJLILLLLZI3.getPaint()) == null || paint2.measureText(strLIZIZ) >= fMeasureText || strLIZIZ == null) {
                    strLIZIZ = "";
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((Object) this.s0.subSequence(0, length));
                sbLIZ2.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            ((ProfileInfoNicknameProtocol) this.l1).LJLLLL(((Integer) this.l2).intValue(), this.i3, strLIZIZ);
        }
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1030680cva.LJ());
        sbLIZ.append(this.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!new C0VSJ(strLIZIZ).exists()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preloadPicToCache localPath = ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" no file exits");
            C1022620cia.LIZ("LikeEffectServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("preloadPicToCache localPath = ");
        sbLIZ3.append(strLIZIZ);
        C1022620cia.LIZ("LikeEffectServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
        ((LikeEffectServiceImpl) this.l1).LJIJI(this.i3, (Context) this.l2, this.s0, strLIZIZ, null);
    }

    public static final void run$0(RunnableC514101zP runnableC514101zP) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoNicknameProtocol@8e9f.updateComponentUIAndData$1");
        try {
            runnableC514101zP.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoNicknameProtocol@8e9f.updateComponentUIAndData$1");
    }

    public static final void run$1(RunnableC514101zP runnableC514101zP) {
        boolean zLIZ;
        C1C7U.LIZ("LikeEffectServiceImpl@2a22.preloadPicToCache$1");
        try {
            runnableC514101zP.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LikeEffectServiceImpl@2a22.preloadPicToCache$1");
    }

    public RunnableC514101zP(int i, Object obj, Object obj2, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.i3 = i;
    }
}

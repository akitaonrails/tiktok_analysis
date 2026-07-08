package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0I6I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6I extends LinearLayout {
    public final C21415018rM LL;
    public final C21415018rM LLILLJJLI;
    public final SmartAvatarImageView LLILLL;
    public final int LLILZ;
    public IMContact LLILZIL;
    public final C01GW LLILZLL;

    private final IDMAvatarLoader getAvatarLoader() {
        return (IDMAvatarLoader) this.LLILZLL.getValue();
    }

    private final CharSequence getShareTips() {
        return getContext().getString(2131845761);
    }

    public final IMContact getBindContactData() {
        return this.LLILZIL;
    }

    public C0I6I(Context context) {
        int iIntValue;
        super(context, null, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLILZ = iIntValue;
        C21146717pB.LIZ(context, R.layout.cs1, this);
        this.LL = (C21415018rM) findViewById(R.id.xyz);
        this.LLILLJJLI = (C21415018rM) findViewById(R.id.username);
        setGravity(16);
        this.LLILLL = (SmartAvatarImageView) findViewById(R.id.bh2);
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1071));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r14, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r15) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I6I.LIZ(int, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):void");
    }
}

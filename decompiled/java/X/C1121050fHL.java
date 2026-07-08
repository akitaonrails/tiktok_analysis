package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuideTarget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121050fHL extends LinearLayout {
    public final C1324720kZq LL;
    public final C16F5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121050fHL(Context context, GiftGuideMessage giftGuideMessage) {
        GuideTarget guideTarget;
        super(context, null, 0);
        String str = null;
        if (giftGuideMessage != null && (guideTarget = giftGuideMessage.guideTarget) != null) {
            str = guideTarget.targetType;
        }
        if (Intrinsics.LJFF(str, "moy")) {
            LinearLayout.inflate(context, R.layout.gnv, this);
            this.LLILLJJLI = (C16F5) findViewById(R.id.znm);
        } else {
            LinearLayout.inflate(context, R.layout.gnu, this);
            this.LLILLJJLI = (C16F5) findViewById(R.id.znl);
        }
        this.LL = (C1324720kZq) findViewById(R.id.lif);
    }
}

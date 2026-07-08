package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558330Lv5 extends BaseContent implements FakeMsgContent {
    public final AIGCSocialModel LL;
    public final int LLILLJJLI = 4078;

    public final C558330Lv5 copy(AIGCSocialModel aIGCSocialModel) {
        return new C558330Lv5(aIGCSocialModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C558330Lv5) && Intrinsics.LJFF(this.LL, ((C558330Lv5) obj).LL);
    }

    public int hashCode() {
        AIGCSocialModel aIGCSocialModel = this.LL;
        if (aIGCSocialModel == null) {
            return 0;
        }
        return aIGCSocialModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterFakeMsgContent(socialModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public int getMsgType() {
        return this.LLILLJJLI;
    }

    public final AIGCSocialModel getSocialModel() {
        return this.LL;
    }

    public C558330Lv5(AIGCSocialModel aIGCSocialModel) {
        this.LL = aIGCSocialModel;
    }
}

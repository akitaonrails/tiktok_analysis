package X;

import Y.ARunnableS129S0100000_29;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19610711o1 extends LinearLayout implements C121I<C19610811o2> {
    public CommentVideoModel LL;
    public String LLILLJJLI;
    public long LLILLL;
    public View LLILZ;
    public boolean LLILZIL;

    public int getMLayoutId() {
        return R.layout.ahm;
    }

    public int getMReplyTextId() {
        return 2131846286;
    }

    public final void setDumpData(InterfaceC568780MSm interfaceC568780MSm) {
    }

    public final void setEnableEdit(boolean z) {
    }

    @Override // X.C121I
    public final InterfaceC384940F7k LIZJ() {
        CommentVideoModel commentVideoModel;
        if (this.LL == null) {
            this.LL = new CommentVideoModel("", "", null, "", null, "", "", "", "", "", 0, "", 0, 0, CommentVideoModel.Type.COMMENT, "", "", null);
        }
        CommentVideoModel commentVideoModel2 = this.LL;
        if (commentVideoModel2 == null) {
            commentVideoModel = new CommentVideoModel("", "", null, "", null, "", "", "", "", "", 0, "", 0, 0, CommentVideoModel.Type.COMMENT, "", "", null);
        } else {
            commentVideoModel = new CommentVideoModel("", "", null, "", null, "", "", "", "", "", 0, "", 0, 0, CommentVideoModel.Type.COMMENT, "", "", null);
            commentVideoModel.setStartTime(commentVideoModel2.getStartTime());
            commentVideoModel.setEndTime(commentVideoModel2.getEndTime());
        }
        return new C19610811o2(commentVideoModel, new InteractStickerStruct());
    }

    @Override // X.C121I
    public final int LJFF() {
        if (getData() == null || !getData().hasTimeData()) {
            return 0;
        }
        return getData().getStartTime();
    }

    private final C424630Gkv getAvatarView() {
        throw null;
    }

    private final TuxTextView getCommentTextView() {
        throw null;
    }

    private final SafeHandler getHandler() {
        throw null;
    }

    private final LinearLayout getTextLayout() {
        throw null;
    }

    public final CommentVideoModel getData() {
        return this.LL;
    }

    public final View getMHintIcon() {
        return this.LLILZ;
    }

    public final String getMUserName() {
        return this.LLILLJJLI;
    }

    public final TuxTextView getReplyTextView() {
        throw null;
    }

    @Override // X.C121I
    public final int LIZ(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getEndTime();
        }
        return i;
    }

    @Override // X.C121I
    public final int LIZIZ(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getEndTime();
        }
        return i;
    }

    @Override // X.C121I
    public final int LIZLLL(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getStartTime();
        }
        return 0;
    }

    @Override // X.C121T
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
    }

    @Override // X.C121T
    public void setHighlightState(EnumC390580FTc enumC390580FTc) {
        boolean z;
        if (enumC390580FTc != EnumC390580FTc.IGNORED) {
            z = true;
        } else {
            z = false;
        }
        setAlpha(z);
    }

    public final void setMHintIcon(View view) {
        this.LLILZ = view;
    }

    public final void setMUserName(String str) {
        this.LLILLJJLI = str;
    }

    public final void setPlayPosition(long j) {
        this.LLILLL = j;
    }

    public final void setTouching(boolean z) {
        if (z == this.LLILZIL) {
            return;
        }
        this.LLILZIL = z;
        if (!z) {
            SystemClock.elapsedRealtime();
            getHandler().postDelayed(new ARunnableS129S0100000_29(this, 150), 1000L);
        }
    }

    @Override // X.C121I
    public final void LJ(InterfaceC384940F7k interfaceC384940F7k, int i, int i2) {
        int startTime;
        C19610811o2 c19610811o2 = (C19610811o2) interfaceC384940F7k;
        CommentVideoModel commentVideoModel = this.LL;
        int endTime = 0;
        if (commentVideoModel != null) {
            CommentVideoModel commentVideoModel2 = c19610811o2.LL;
            if (commentVideoModel2 != null) {
                startTime = commentVideoModel2.getStartTime();
            } else {
                startTime = 0;
            }
            commentVideoModel.setStartTime(startTime);
        }
        CommentVideoModel commentVideoModel3 = this.LL;
        if (commentVideoModel3 != null) {
            CommentVideoModel commentVideoModel4 = c19610811o2.LL;
            if (commentVideoModel4 != null) {
                endTime = commentVideoModel4.getEndTime();
            }
            commentVideoModel3.setEndTime(endTime);
        }
        NormalTrackTimeStamp normalTrackTimeStampLIZIZ = C1429860nJQ.LIZIZ(c19610811o2.LLILLJJLI);
        NormalTrackTimeStamp normalTrackTimeStampLIZIZ2 = C1429860nJQ.LIZIZ(null);
        if (normalTrackTimeStampLIZIZ != null && normalTrackTimeStampLIZIZ2 != null) {
            normalTrackTimeStampLIZIZ.setRotation(normalTrackTimeStampLIZIZ.getRotation() - normalTrackTimeStampLIZIZ2.getRotation());
            if (!Intrinsics.LIZLLL(normalTrackTimeStampLIZIZ2.getScale(), 0.0f)) {
                normalTrackTimeStampLIZIZ.setScale(Float.valueOf(normalTrackTimeStampLIZIZ.getScale().floatValue() / normalTrackTimeStampLIZIZ2.getScale().floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(normalTrackTimeStampLIZIZ);
            String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), arrayList);
            InteractStickerStruct interactStickerStruct = c19610811o2.LLILLJJLI;
            if (interactStickerStruct != null) {
                interactStickerStruct.setTrackList(json);
            }
        }
    }
}

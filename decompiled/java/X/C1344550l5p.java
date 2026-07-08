package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0l5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344550l5p implements InterfaceC2753014t, Serializable {
    public static final int $stable = 8;
    public Comment LL;
    public String LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public C1339550kxl LLILZIL;
    public Comment LLILZLL;
    public Boolean LLIZ;
    public Boolean LLIZLLLIL;

    public String getSourceId() {
        return "comment_photo_inner_flow_context_source";
    }

    public C1344550l5p() {
        Boolean bool = Boolean.FALSE;
        this.LLIZ = bool;
        this.LLIZLLLIL = bool;
    }

    public final Comment getCurSelectedComment() {
        return this.LLILZLL;
    }

    public final int getDragState() {
        return this.LLILLL;
    }

    public final String getEnterCacheUrl() {
        return this.LLILLJJLI;
    }

    public final Comment getEnterComment() {
        return this.LL;
    }

    public final Boolean getFromLandscapeMode() {
        return this.LLIZLLLIL;
    }

    public final C1339550kxl getMobInfo() {
        return this.LLILZIL;
    }

    public final int getScrollState() {
        return this.LLILZ;
    }

    public final Boolean isRequesting() {
        return this.LLIZ;
    }

    public final void setCurSelectedComment(Comment comment) {
        this.LLILZLL = comment;
    }

    public final void setDragState(int i) {
        this.LLILLL = i;
    }

    public final void setEnterCacheUrl(String str) {
        this.LLILLJJLI = str;
    }

    public final void setEnterComment(Comment comment) {
        this.LL = comment;
    }

    public final void setFromLandscapeMode(Boolean bool) {
        this.LLIZLLLIL = bool;
    }

    public final void setMobInfo(C1339550kxl c1339550kxl) {
        this.LLILZIL = c1339550kxl;
    }

    public final void setRequesting(Boolean bool) {
        this.LLIZ = bool;
    }

    public final void setScrollState(int i) {
        this.LLILZ = i;
    }
}

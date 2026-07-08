package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: X.0nqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450600nqs implements Serializable {
    public static final int $stable = 8;
    public Aweme aweme;
    public boolean createByAi;
    public String currentPath;
    public Set<String> editList;
    public String enterFrom;
    public AIChatGenNode imageAIChatGenNode;
    public int imageAiHeight;
    public String imageAiPath;
    public int imageAiWidth;
    public String imageEditPath;
    public CommentImageModel imageOriginalPath;
    public boolean isFromInternalImagePage;
    public boolean isOnlyCrop;
    public Set<String> sessionEditList;
    public String sessionId;
    public VideoPublishEditModel videoPublishEditModel;

    public final boolean isFromInternalImagePage() {
        return this.isFromInternalImagePage;
    }

    public final boolean isOnlyCrop() {
        return this.isOnlyCrop;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setCreateByAi(boolean z) {
        this.createByAi = z;
    }

    public final void setCurrentPath(String str) {
        this.currentPath = str;
    }

    public final void setEditList(Set<String> set) {
        this.editList = set;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFromInternalImagePage(boolean z) {
        this.isFromInternalImagePage = z;
    }

    public final void setImageAIChatGenNode(AIChatGenNode aIChatGenNode) {
        this.imageAIChatGenNode = aIChatGenNode;
    }

    public final void setImageAiHeight(int i) {
        this.imageAiHeight = i;
    }

    public final void setImageAiPath(String str) {
        this.imageAiPath = str;
    }

    public final void setImageAiWidth(int i) {
        this.imageAiWidth = i;
    }

    public final void setImageEditPath(String str) {
        this.imageEditPath = str;
    }

    public final void setImageOriginalPath(CommentImageModel commentImageModel) {
        this.imageOriginalPath = commentImageModel;
    }

    public final void setOnlyCrop(boolean z) {
        this.isOnlyCrop = z;
    }

    public final void setSessionEditList(Set<String> set) {
        this.sessionEditList = set;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setVideoPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.videoPublishEditModel = videoPublishEditModel;
    }

    public C1450600nqs(CommentImageModel commentImageModel, String str, String str2, VideoPublishEditModel videoPublishEditModel, boolean z, Set<String> set, Set<String> set2, Aweme aweme, String str3, String str4, boolean z2, String str5, int i, int i2, AIChatGenNode aIChatGenNode, boolean z3) {
        this.imageOriginalPath = commentImageModel;
        this.imageEditPath = str;
        this.currentPath = str2;
        this.videoPublishEditModel = videoPublishEditModel;
        this.isOnlyCrop = z;
        this.editList = set;
        this.sessionEditList = set2;
        this.aweme = aweme;
        this.enterFrom = str3;
        this.sessionId = str4;
        this.createByAi = z2;
        this.imageAiPath = str5;
        this.imageAiHeight = i;
        this.imageAiWidth = i2;
        this.imageAIChatGenNode = aIChatGenNode;
        this.isFromInternalImagePage = z3;
    }
}

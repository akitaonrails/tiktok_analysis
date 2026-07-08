package X;

/* JADX INFO: renamed from: X.1ETI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1ETI {
    long getFirstShownTs(EnumC1778780wOC enumC1778780wOC, String str);

    boolean getIsUserDismissed(EnumC1778780wOC enumC1778780wOC, String str);

    String getUUIDToDisplay(EnumC1778780wOC enumC1778780wOC, String str);

    boolean hasCreateLocalVideoSticker();

    boolean hasCreatePhotoSticker();

    boolean hasShowNewTagForCreationEntranceAndMarkShow();

    void markCommentNewTagClicked();

    void markCreatedLocalVideoSticker();

    void markCreatedPhotoSticker();

    void resetForDebug();

    void setFirstShownTs(EnumC1778780wOC enumC1778780wOC, String str, long j);

    void setIsUserDismissed(EnumC1778780wOC enumC1778780wOC, String str, boolean z);

    void setUUIDToDisplay(EnumC1778780wOC enumC1778780wOC, String str, String str2);

    boolean shouldShowCommentNewTagAndMarkShown();
}

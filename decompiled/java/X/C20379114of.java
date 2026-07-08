package X;

import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookEditorInfo;

/* JADX INFO: renamed from: X.14of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20379114of {
    public Playbook LIZ;
    public C20360614lg LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookDetail(playbook=");
        Playbook playbook = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Playbook(playbookId=");
        sbLIZ2.append(playbook.playbookId);
        sbLIZ2.append(", authorInfo=");
        sbLIZ2.append(playbook.authorInfo);
        sbLIZ2.append(", content=");
        PlaybookContent playbookContent = playbook.content;
        String strLIZIZ = null;
        if (playbookContent != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PlaybookContent(textType=");
            sbLIZ3.append(playbookContent.textType);
            sbLIZ3.append(", title='");
            sbLIZ3.append(playbookContent.title);
            sbLIZ3.append("', coverUrl='");
            sbLIZ3.append(playbookContent.coverUrl);
            sbLIZ3.append("', description='");
            sbLIZ3.append(playbookContent.description);
            sbLIZ3.append("', playbookContentId=");
            sbLIZ3.append(playbookContent.playbookContentId);
            sbLIZ3.append(", originalPlaybookContentId=");
            sbLIZ3.append(playbookContent.originalPlaybookContentId);
            sbLIZ3.append(", contentStatus=");
            sbLIZ3.append(playbookContent.contentStatus);
            sbLIZ3.append(", minSymphonyEngineAppVersion=");
            sbLIZ3.append(playbookContent.minSymphonyEngineAppVersion);
            sbLIZ3.append(", editorInfo=");
            PlaybookEditorInfo playbookEditorInfo = playbookContent.editorInfo;
            if (playbookEditorInfo != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("PlaybookEditorInfo(editorType='");
                sbLIZ4.append(playbookEditorInfo.editorType);
                sbLIZ4.append("', version=");
                sbLIZ4.append(playbookEditorInfo.version);
                sbLIZ4.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", flowStr='");
            sbLIZ3.append(playbookContent.flowStr);
            sbLIZ3.append("')");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", totalFavorites=");
        sbLIZ2.append(playbook.totalFavorites);
        sbLIZ2.append(", totalUsage=");
        sbLIZ2.append(playbook.totalUsage);
        sbLIZ2.append(", createTime=");
        sbLIZ2.append(playbook.createTime);
        sbLIZ2.append(", updateTime=");
        sbLIZ2.append(playbook.updateTime);
        sbLIZ2.append(", isUpdatedVersion=");
        sbLIZ2.append(playbook.isUpdatedVersion);
        sbLIZ2.append(", isMyFavorite=");
        sbLIZ2.append(playbook.isMyFavorite);
        sbLIZ2.append(')');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(", playBookFlow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20379114of(Playbook playbook, C20360614lg c20360614lg) {
        this.LIZ = playbook;
        this.LIZIZ = c20360614lg;
    }
}

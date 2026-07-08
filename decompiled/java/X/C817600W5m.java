package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0W5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817600W5m implements Serializable {
    public final String avatarUri;
    public final List<String> avatarUrls;
    public final int backgroundIndex;
    public final long createdTime;
    public final boolean isRead;
    public final long modifiedTime;
    public final int privacyPermission;
    public final String taskId;
    public final int taskStatus;
    public final String text;
    public final List<StoryNoteTextExtra> textExtras;
    public final String uid;
    public static final C817610W5n Companion = new Object() { // from class: X.0W5n
    };
    public static final int $stable = 8;

    public final C817600W5m copy(String str, String str2, long j, long j2, String str3, int i, int i2, int i3, List<String> list, boolean z, String str4, List<StoryNoteTextExtra> list2) {
        return new C817600W5m(str, str2, j, j2, str3, i, i2, i3, list, z, str4, list2);
    }

    public final C817600W5m markAsRead() {
        return copy(this.taskId, this.uid, this.createdTime, this.modifiedTime, this.text, this.backgroundIndex, this.privacyPermission, this.taskStatus, this.avatarUrls, true, this.avatarUri, this.textExtras);
    }

    public final void deleteCoverFile() {
        File coverFile = getCoverFile();
        if (coverFile.exists()) {
            coverFile.delete();
        }
    }

    public final File getCoverFile() {
        String strLJJJJJL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJJL();
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(new C0VSJ(strLJJJJJL).mkdirs()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return new C0VSJ(strLJJJJJL, this.taskId + '_' + this.modifiedTime + ".jpeg");
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void saveCoverBitmap(Bitmap bitmap) throws Throwable {
        File coverFile = getCoverFile();
        if (coverFile.exists()) {
            coverFile.delete();
        }
        C2477909nN.LJI(bitmap, coverFile.getPath(), Bitmap.CompressFormat.JPEG, 0, 4);
    }

    public final C817600W5m update(int i, List<String> list, String str) {
        return copy(this.taskId, this.uid, this.createdTime, System.currentTimeMillis(), this.text, this.backgroundIndex, this.privacyPermission, i, list, this.isRead, str, this.textExtras);
    }

    public C817600W5m(String str, String str2, long j, long j2, String str3, int i, int i2, int i3, List<String> list, boolean z, String str4, List<StoryNoteTextExtra> list2) {
        this.taskId = str;
        this.uid = str2;
        this.createdTime = j;
        this.modifiedTime = j2;
        this.text = str3;
        this.backgroundIndex = i;
        this.privacyPermission = i2;
        this.taskStatus = i3;
        this.avatarUrls = list;
        this.isRead = z;
        this.avatarUri = str4;
        this.textExtras = list2;
    }
}

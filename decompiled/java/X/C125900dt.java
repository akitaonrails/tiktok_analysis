package X;

import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.SimpleUser;

/* JADX INFO: renamed from: X.00dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C125900dt {
    public static final C20412414u2 LIZ(Playbook playbook, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        long j = playbook.playbookId;
        PlaybookContent playbookContent = playbook.content;
        SimpleUser simpleUser = playbook.authorInfo;
        long j2 = playbook.totalFavorites;
        long j3 = playbook.totalUsage;
        long j4 = playbook.updateTime;
        boolean z6 = playbook.isUpdatedVersion;
        boolean z7 = playbook.isMyFavorite;
        int i = playbook.playbookVisibility;
        boolean z8 = playbook.isMyCreation;
        boolean zLIZ = playbook.LIZ();
        int i2 = playbook.playbookType;
        if (i2 != 4 && i2 != 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i2 != 4 && i2 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new C20412414u2(j, playbookContent, simpleUser, j2, j3, j4, z6, z7, z, i, z2, z8, zLIZ, z4, z5, z3);
    }
}

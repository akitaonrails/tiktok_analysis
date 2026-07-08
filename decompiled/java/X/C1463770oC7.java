package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0oC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463770oC7 implements Serializable {
    public boolean hasAudio;
    public boolean hasAudioSlot;
    public String identityKey;
    public String libraryId;
    public String sourceType;

    public C1463770oC7() {
        this("", "", false, false, "");
    }

    public final void setHasAudio(boolean z) {
        this.hasAudio = z;
    }

    public final void setHasAudioSlot(boolean z) {
        this.hasAudioSlot = z;
    }

    public final void setIdentityKey(String str) {
        this.identityKey = str;
    }

    public final void setLibraryId(String str) {
        this.libraryId = str;
    }

    public final void setSourceType(String str) {
        this.sourceType = str;
    }

    public C1463770oC7(String str, String str2, boolean z, boolean z2, String str3) {
        this.libraryId = str;
        this.sourceType = str2;
        this.hasAudioSlot = z;
        this.hasAudio = z2;
        this.identityKey = str3;
    }
}

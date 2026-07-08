package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0QZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672610QZv implements Serializable {
    public final String attachProductCardValue;
    public final C0QZ2 attachStoreCardValue;
    public final C672500QZk attachTalentLiveCardValue;
    public final C0QXT cardType;
    public final String scene;

    public C672610QZv() {
        this(null, null, null, null, null);
    }

    public C672610QZv(C0QXT c0qxt, String str, C672500QZk c672500QZk, C0QZ2 c0qz2, String str2) {
        this.cardType = c0qxt;
        this.attachProductCardValue = str;
        this.attachTalentLiveCardValue = c672500QZk;
        this.attachStoreCardValue = c0qz2;
        this.scene = str2;
    }
}

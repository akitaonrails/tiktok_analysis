package X;

/* JADX INFO: renamed from: X.0f7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public enum EnumC1114820f7I {
    Keyboard,
    Panel,
    Close;

    public String LL = "";

    public boolean isEmojiPanel() {
        return this == Panel && "emoji".equals(this.LL);
    }

    public String getPanelType() {
        return this.LL;
    }

    public static EnumC1114820f7I valueOf(String str) {
        return (EnumC1114820f7I) C08FF.LIZ(EnumC1114820f7I.class, str);
    }

    public EnumC1114820f7I setPanelType(String str) {
        this.LL = str;
        return this;
    }

    EnumC1114820f7I() {
    }
}

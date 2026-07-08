package X;

import java.util.List;

/* JADX INFO: renamed from: X.068w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15600068w {
    public static final List<EnumC15599068v> LIZ;
    public static final List<EnumC15599068v> LIZIZ;
    public static final List<EnumC15599068v> LIZJ;

    static {
        EnumC15599068v enumC15599068v = EnumC15599068v.UPDATE_MESSAGE_LIST;
        LIZ = C1697810uHb.LJIIJJI(EnumC15599068v.LOAD_ROOM, enumC15599068v, EnumC15599068v.COMMON_LOCAL_TASK, EnumC15599068v.FETCH_NOTICE);
        LIZIZ = C1697810uHb.LJIIJJI(enumC15599068v, EnumC15599068v.ON_SEND_UPDATE_MESSAGE_LIST, EnumC15599068v.COMMON_CHAT_NOTICE_SEND_MESSAGE_EVENT);
        LIZJ = C1697810uHb.LJIIJJI(enumC15599068v, EnumC15599068v.COMMON_CHAT_NOTICE_GET_MESSAGE_EVENT);
    }
}

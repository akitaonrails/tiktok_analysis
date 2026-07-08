package X;

import com.bytedance.im.core.proto.MediaInfo;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869880YAo {
    public static final /* synthetic */ int LIZ = 0;

    public static final C869590Y9l LIZ(C0YEM c0yem, MessageBody messageBody) {
        boolean z;
        String str;
        String str2;
        String str3;
        C869590Y9l c869590Y9lLJJJ;
        Map<String, String> map = messageBody.ext;
        if (map != null && map.containsKey("s:server_message_id")) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "";
        if (!z || (str = map.get("s:server_message_id")) == null) {
            str = "";
        }
        C869580Y9k c869580Y9kLJI = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null && (c869590Y9lLJJJ = c869580Y9kLJI.LJJJ(lLJIILIIL.longValue())) != null && messageBody.version.longValue() > c869590Y9lLJJJ.getVersion()) {
            return c869590Y9lLJJJ;
        }
        Map<String, String> map2 = messageBody.ext;
        if (map2 != null && map2.containsKey("s:client_message_id") && (str2 = map2.get("s:client_message_id")) != null && str2.length() != 0 && (str3 = map2.get("s:client_message_id")) != null) {
            str4 = str3;
        }
        if (str4.length() == 0) {
            return c869580Y9kLJI.LJJJ(messageBody.server_message_id.longValue());
        }
        return c869580Y9kLJI.LJJJI(str4);
    }

    public static final C0YB3 LIZJ(C0YEM c0yem, MessageBody messageBody) {
        C869590Y9l c869590Y9lLIZ = LIZ(c0yem, messageBody);
        if (c869590Y9lLIZ == null) {
            return new C0YB3(null);
        }
        ByteString byteString = messageBody.content_pb;
        if (byteString != null && byteString.size() > 0) {
            c869590Y9lLIZ.setContentPB(messageBody.content_pb);
            if (c0yem.LJIIIZ().LJJLIIIIJ.LJJIIJZLJL) {
                c869590Y9lLIZ.setMsgType(messageBody.message_type.intValue());
            }
            return LIZLLL(c0yem, c869590Y9lLIZ, messageBody);
        }
        return new C0YB3(c869590Y9lLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static List LIZIZ(String str, List list, List list2) {
        ?? arrayList;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                MediaInfo mediaInfo = (MediaInfo) it2.next();
                List<MediaURLStruct> list3 = mediaInfo.url_info_list;
                if (list3 != null) {
                    for (MediaURLStruct mediaURLStruct : list3) {
                        if (mediaURLStruct != null) {
                            EnumC870720YDu enumC870720YDu = mediaInfo.type;
                            C0YC6 c0yc6 = new C0YC6(str, null, null, 0L, null, -1, new LinkedHashMap(), 0, null, mediaURLStruct.display_type, null, null, enumC870720YDu, mediaURLStruct, null, null);
                            EnumC870720YDu enumC870720YDu2 = mediaInfo.type;
                            if (enumC870720YDu2 != null) {
                                int i = C870690YDr.LIZ[enumC870720YDu2.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            c0yc6.setAudioId(mediaInfo.id);
                                            c0yc6.setDuration(mediaURLStruct.duration);
                                            c0yc6.setSecretKey(mediaInfo.decrypt_key);
                                            c0yc6.setCodec(mediaURLStruct.codec);
                                        }
                                    } else {
                                        c0yc6.setVid(mediaInfo.id);
                                    }
                                } else {
                                    c0yc6.setUri(mediaInfo.id);
                                    c0yc6.setSecretKey(mediaInfo.decrypt_key);
                                }
                            }
                            c13dvLIZIZ.add(c0yc6);
                        }
                    }
                }
            }
        }
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C0YC6) obj).index >= 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return C13LP.LJLIL(arrayList, listLIZ);
    }

    public static final C0YB3 LIZLLL(C0YEM c0yem, C869590Y9l c869590Y9l, MessageBody messageBody) {
        List<String> listLIZ;
        String str = messageBody.scene;
        if (str != null && str.length() != 0) {
            c869590Y9l.setScene(messageBody.scene);
        }
        c869590Y9l.updatePropertyFromServer(messageBody);
        Map<String, String> map = messageBody.ext;
        if (map != null && !map.isEmpty()) {
            c869590Y9l.setExt(messageBody.ext);
        }
        Long l = messageBody.ttl;
        if (l != null) {
            c869590Y9l.setTtl(l.longValue());
        }
        String str2 = messageBody.content;
        if (str2 != null) {
            c869590Y9l.setContent(str2);
        }
        ByteString byteString = messageBody.biz_persistent_extra;
        if (byteString != null) {
            c869590Y9l.setPersistentExtra(byteString);
        }
        if (messageBody.media_info_list != null) {
            List<C0YC6> attachments = c869590Y9l.getAttachments();
            List<C0YC6> listLIZIZ = LIZIZ(c869590Y9l.getUuid(), c869590Y9l.getAttachments(), messageBody.media_info_list);
            c869590Y9l.setAttachments(listLIZIZ);
            c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJII().LJI(listLIZIZ);
            listLIZ = C870360YCk.LIZ(attachments, listLIZIZ);
        } else {
            listLIZ = null;
        }
        boolean zLJLJJL = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJLJJL(c869590Y9l);
        c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJ().LJIIIZ(c869590Y9l);
        return new C0YB3(c869590Y9l, listLIZ, zLJLJJL);
    }
}

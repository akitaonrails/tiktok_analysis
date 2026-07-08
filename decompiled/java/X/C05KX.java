package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05KX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05KX implements C05GJ {
    public final List<String> LIZ = Collections.singletonList("load_message");
    public final C05GR LIZIZ = new C05GR(8);

    @Override // X.C05GJ
    public final void LIZIZ() {
    }

    @Override // X.C05GJ
    public final String getId() {
        return "chat_live_preload";
    }

    @Override // X.C05GJ
    public final C05GR LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C05GJ
    public final List<String> LIZJ() {
        return this.LIZ;
    }

    @Override // X.C05GJ
    public final Object LIZLLL(Object obj) {
        String roomOwnerId;
        UrlModel roomCover;
        List<String> urlList;
        Object objLJJJLL;
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof C869590Y9l) {
                    C869590Y9l c869590Y9l = (C869590Y9l) obj2;
                    if (c869590Y9l.getMsgType() == 1021) {
                        ShareLiveContent shareLiveContent = (ShareLiveContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveContent.class);
                        if (shareLiveContent != null && (roomCover = shareLiveContent.getRoomCover()) != null && (urlList = roomCover.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                            Boolean.valueOf(arrayList.add(new C048000Fi(c869590Y9l.getUuid(), C2097608Jq.LJIIIIZZ(new Pair("URL", objLJJJLL), new Pair("CACHE_SPACE", C06TB.DEFAULT.getSpace())))));
                        }
                        ShareLiveContent shareLiveContent2 = (ShareLiveContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveContent.class);
                        if (shareLiveContent2 != null && (roomOwnerId = shareLiveContent2.getRoomOwnerId()) != null) {
                            Boolean.valueOf(arrayList.add(new C047600Fe(roomOwnerId, C2097908Jt.LIZJ(new Pair("PRELOAD_AVATAR", Boolean.TRUE)))));
                        }
                        if (arrayList.size() >= this.LIZIZ.LIZ) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return arrayList;
    }
}

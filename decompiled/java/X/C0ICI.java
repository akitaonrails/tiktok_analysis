package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICI {
    public static GifContent LIZIZ(C0ICG c0icg) {
        C0ICM c0icmLJJJIL;
        String name;
        GifContent gifContent;
        C0ZCV c0zcvLJJJI;
        GifContent gifContent2;
        Class<?> cls;
        C0Z9Y c0z9y = (C0Z9Y) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        Class<?> cls2 = null;
        if (c0z9y != null) {
            c0icmLJJJIL = c0z9y.LJJJIL();
        } else {
            c0icmLJJJIL = null;
        }
        try {
            gifContent = (GifContent) BaseContentParserKt.getOrParseJsonContent(c0icg.LLILII().LIZ.LIZ, GifContent.class);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            Object localCache = c0icg.LLILII().LIZ.LIZ.getLocalCache(501);
            if (localCache != null) {
                name = localCache.getClass().getName();
            } else {
                name = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msgType = ");
            sbLIZ.append(c0icg.LLILII().LIZ.LIZ.getMsgType());
            sbLIZ.append(" className = ");
            sbLIZ.append(name);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            gifContent = null;
        }
        if (gifContent == null) {
            C1AF0.LIZJ("Broken card; msgType = " + c0icg.LLILII().LIZ.LIZ.getMsgType());
        }
        if (c0icmLJJJIL != null) {
            c0zcvLJJJI = c0icmLJJJIL.LJJJI(c0icg.LLILII().LIZ.LIZ, gifContent);
        } else {
            c0zcvLJJJI = null;
        }
        if (c0zcvLJJJI instanceof GifContent) {
            gifContent2 = (GifContent) c0zcvLJJJI;
        } else {
            gifContent2 = null;
        }
        if (gifContent != null) {
            cls = gifContent.getClass();
        } else {
            cls = null;
        }
        if (gifContent2 != null) {
            cls2 = gifContent2.getClass();
        }
        if (Intrinsics.LJFF(cls, cls2) && gifContent2 != null) {
            return gifContent2;
        }
        return gifContent;
    }

    public static C461530I7z LIZ(C0ICG c0icg, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ICG c0icg2;
        if ((interfaceC1891350zJl instanceof C0ICG) && (c0icg2 = (C0ICG) interfaceC1891350zJl) != null) {
            C0ICH c0ich = new C0ICH(!Intrinsics.LJFF(c0icg.LIZJ(), c0icg2.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0icg, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0ich, 5);
        }
        return C461450I7r.LIZIZ(c0icg, interfaceC1891350zJl);
    }
}

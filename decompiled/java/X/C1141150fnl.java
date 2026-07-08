package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.live.render.engine.sticker.NodeTag;
import com.bytedance.live.render.engine.sticker.TtlhReceiveExtra;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141150fnl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(LiveEffect liveEffect, TtlhReceiveExtra ttlhReceiveExtra) {
        boolean z;
        boolean z2;
        if (liveEffect == null || TextUtils.isEmpty(liveEffect.getFilePath())) {
            return true;
        }
        ArrayList arrayList = (ArrayList) C13LP.LLIILII(ttlhReceiveExtra.nodePaths, ttlhReceiveExtra.nodeTags);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return true;
        }
        Pair pair = (Pair) it2.next();
        if (!TextUtils.isEmpty(((NodeTag) pair.getSecond()).msgId) && Intrinsics.LJFF(((NodeTag) pair.getSecond()).msgId, String.valueOf(liveEffect.getMsgId()))) {
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty((CharSequence) pair.getFirst()) && Intrinsics.LJFF(pair.getFirst(), liveEffect.getFilePath())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str, String str2, LiveEffect liveEffect) {
        boolean z;
        if (liveEffect == null || TextUtils.isEmpty(liveEffect.getFilePath())) {
            return true;
        }
        boolean zLJFF = Intrinsics.LJFF(str, String.valueOf(liveEffect.getMsgId()));
        if (!TextUtils.isEmpty(str2) && Intrinsics.LJFF(str2, liveEffect.getFilePath())) {
            z = true;
        } else {
            z = false;
        }
        if (!zLJFF || !z) {
            return true;
        }
        return false;
    }
}

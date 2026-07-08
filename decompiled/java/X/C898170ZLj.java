package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.lightinteract.impl.analytics.LightInteractionEntranceAutoDebounceReporter;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898170ZLj implements C0Z9X {
    public static final C898170ZLj LL = new C898170ZLj();
    public static final Map<Lifecycle, LightInteractionEntranceAutoDebounceReporter> LLILLJJLI = new ConcurrentHashMap();
    public static final Map<String, C898160ZLi> LLILLL = new ConcurrentHashMap();

    @Override // X.C0Z9X
    public final InterfaceC892560Yzu LIZJ() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2.equals("v1_basic_nudge_back_src") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r2.equals("v1_basic_nudge_src") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r0 = "nudge";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r2.equals("spark_back_v1") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r2.equals("spark_v1") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = "spark";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0Z9X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII(java.lang.String r2) {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager r0 = com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager.LLJILLL
            com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r0 = r0.LJJIIZI(r2)
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.getEventName()
            if (r0 != 0) goto L17
        Le:
            int r0 = r2.hashCode()
            switch(r0) {
                case -753553365: goto L21;
                case 220956837: goto L18;
                case 644373873: goto L2c;
                case 2061481757: goto L35;
                default: goto L15;
            }
        L15:
            java.lang.String r0 = ""
        L17:
            return r0
        L18:
            java.lang.String r0 = "v1_basic_nudge_back_src"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L29
            goto L15
        L21:
            java.lang.String r0 = "v1_basic_nudge_src"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
        L29:
            java.lang.String r0 = "nudge"
            goto L40
        L2c:
            java.lang.String r0 = "spark_back_v1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3e
            goto L15
        L35:
            java.lang.String r0 = "spark_v1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3e
            goto L15
        L3e:
            java.lang.String r0 = "spark"
        L40:
            if (r0 != 0) goto L17
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C898170ZLj.LJII(java.lang.String):java.lang.String");
    }

    @Override // X.C0Z9X
    public final String LJIIL(C869590Y9l c869590Y9l) {
        String messageType;
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("story_viewer_list_redesign"), "1")) {
            return "light_interaction";
        }
        LightInteractionCommonResource lightInteractionCommonResourceLJJJLZIJ = LightInteractionManager.LLJILLL.LJJJLZIJ(c869590Y9l);
        if (lightInteractionCommonResourceLJJJLZIJ == null || (messageType = lightInteractionCommonResourceLJJJLZIJ.getMessageType()) == null) {
            return null;
        }
        int iHashCode = messageType.hashCode();
        if (iHashCode != 53) {
            if (iHashCode != 55) {
                if (iHashCode != 1515116 || !messageType.equals("1805")) {
                    return null;
                }
                return "sticker";
            }
            if (!messageType.equals("7")) {
                return null;
            }
            return "text";
        }
        if (!messageType.equals("5")) {
            return null;
        }
        return "gif";
    }

    @Override // X.C0Z9X
    public final InterfaceC1357410lQZ LJIIZILJ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LLILLL;
        Object c898160ZLi = concurrentHashMap.get(str);
        if (c898160ZLi == null) {
            c898160ZLi = new C898160ZLi();
            concurrentHashMap.put(str, c898160ZLi);
        }
        return (InterfaceC1357410lQZ) c898160ZLi;
    }

    @Override // X.C0Z9X
    public final String LJJIIZ(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("a:light_interaction_name");
        if (str == null) {
            str = c869590Y9l.getLocalExt().get("a:light_interaction_name");
        }
        String str2 = c869590Y9l.getExt().get("a:src");
        if (str == null) {
            str = "";
        }
        String strLJII = LJII(str);
        if (strLJII.length() <= 0) {
            if (!Intrinsics.LJFF(str2, "action_bar:nudge") && !Intrinsics.LJFF(str2, "action_bar:nudge_back")) {
                if (!Intrinsics.LJFF(str2, "action_bar:spark") && !Intrinsics.LJFF(str2, "action_bar:spark_back")) {
                    return null;
                }
                return "spark";
            }
            return "nudge";
        }
        return strLJII;
    }

    @Override // X.C0Z9X
    public final InterfaceC892560Yzu LJJIJIIJIL(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return C898150ZLh.LL;
        }
        Map<Lifecycle, LightInteractionEntranceAutoDebounceReporter> map = LLILLJJLI;
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        Object lightInteractionEntranceAutoDebounceReporter = concurrentHashMap.get(lifecycle);
        if (lightInteractionEntranceAutoDebounceReporter == null) {
            lightInteractionEntranceAutoDebounceReporter = new LightInteractionEntranceAutoDebounceReporter(lifecycleOwner);
            concurrentHashMap.put(lifecycle, lightInteractionEntranceAutoDebounceReporter);
        }
        return (InterfaceC892560Yzu) lightInteractionEntranceAutoDebounceReporter;
    }

    @Override // X.C0Z9X
    public final String LJJJJZI(String str) {
        try {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enter_method");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0Z9X
    public final String LJJLIIIJLLLLLLLZ(Boolean bool) {
        if (bool == null) {
            return "-1";
        }
        if (bool.booleanValue()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZ(Integer num, String str, String str2) {
        String string;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("push_type", str);
        pairArr[1] = new Pair("light_interaction_name", str2);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[2] = new Pair("error_code", string);
        C20684815ws.LJIILLIIL("light_interaction_push_show", C2097608Jq.LJIIIIZZ(pairArr));
    }
}

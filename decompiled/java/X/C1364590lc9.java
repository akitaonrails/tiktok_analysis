package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364590lc9 {
    public static final C1364590lc9 LIZ = new C1364590lc9();

    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0287 A[Catch: JSONException -> 0x02f2, TRY_ENTER, TryCatch #16 {JSONException -> 0x02f2, blocks: (B:88:0x01fc, B:91:0x020f, B:94:0x0217, B:96:0x021d, B:109:0x023c, B:119:0x0254, B:122:0x025f, B:125:0x0267, B:128:0x0274, B:130:0x027a, B:133:0x0287, B:135:0x0295, B:139:0x02a2, B:142:0x02b0, B:144:0x02b6, B:146:0x02c0, B:148:0x02c6, B:151:0x02d3, B:153:0x02d9, B:156:0x02e6, B:158:0x02ec), top: B:817:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0375 A[Catch: JSONException -> 0x04ec, TRY_ENTER, TRY_LEAVE, TryCatch #22 {JSONException -> 0x04ec, blocks: (B:170:0x032f, B:173:0x0357, B:179:0x0375, B:238:0x04a9, B:240:0x04b1, B:242:0x04b7, B:245:0x04c4, B:248:0x04db, B:250:0x04e1, B:182:0x0384, B:185:0x0395, B:189:0x03a8, B:192:0x03b5, B:195:0x03c4, B:198:0x03d3, B:201:0x03e2, B:204:0x03f3, B:207:0x0404, B:210:0x0415, B:213:0x0426, B:216:0x0436, B:219:0x0446, B:222:0x0456, B:225:0x0466, B:228:0x0476, B:231:0x0486, B:234:0x0496), top: B:829:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037c A[Catch: JSONException -> 0x0947, TRY_ENTER, TryCatch #4 {JSONException -> 0x0947, blocks: (B:176:0x036b, B:236:0x04a5, B:243:0x04bc, B:246:0x04c9, B:253:0x04ef, B:180:0x037c, B:183:0x038d, B:186:0x039e, B:190:0x03af, B:193:0x03bc, B:196:0x03cd, B:199:0x03da, B:202:0x03eb, B:205:0x03fc, B:208:0x040d, B:211:0x041e, B:214:0x042e, B:217:0x043e, B:220:0x044e, B:223:0x045e, B:226:0x046e, B:229:0x047e, B:232:0x048e, B:235:0x049e), top: B:794:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04c4 A[Catch: JSONException -> 0x04ec, TRY_ENTER, TRY_LEAVE, TryCatch #22 {JSONException -> 0x04ec, blocks: (B:170:0x032f, B:173:0x0357, B:179:0x0375, B:238:0x04a9, B:240:0x04b1, B:242:0x04b7, B:245:0x04c4, B:248:0x04db, B:250:0x04e1, B:182:0x0384, B:185:0x0395, B:189:0x03a8, B:192:0x03b5, B:195:0x03c4, B:198:0x03d3, B:201:0x03e2, B:204:0x03f3, B:207:0x0404, B:210:0x0415, B:213:0x0426, B:216:0x0436, B:219:0x0446, B:222:0x0456, B:225:0x0466, B:228:0x0476, B:231:0x0486, B:234:0x0496), top: B:829:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0522 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x055c A[Catch: JSONException -> 0x0673, TRY_ENTER, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05d0 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05e1 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05f2 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0603 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0614 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0625 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0636 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x064b A[Catch: JSONException -> 0x0945, TRY_ENTER, TryCatch #3 {JSONException -> 0x0945, blocks: (B:261:0x051c, B:264:0x0556, B:284:0x05b9, B:287:0x05d5, B:290:0x05e6, B:293:0x05f7, B:296:0x0608, B:299:0x0619, B:302:0x062a, B:305:0x063b, B:309:0x064b, B:314:0x0676, B:318:0x0684), top: B:792:0x051c }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0662 A[Catch: JSONException -> 0x0673, TRY_ENTER, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0673, blocks: (B:258:0x0509, B:263:0x0522, B:266:0x055c, B:271:0x057d, B:272:0x0582, B:274:0x058a, B:276:0x0590, B:278:0x059a, B:280:0x05a6, B:283:0x05b6, B:270:0x0579, B:286:0x05d0, B:289:0x05e1, B:292:0x05f2, B:295:0x0603, B:298:0x0614, B:301:0x0625, B:304:0x0636, B:307:0x0643, B:311:0x0662, B:268:0x0564), top: B:821:0x0509, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06a4 A[Catch: JSONException -> 0x06bb, TRY_ENTER, TRY_LEAVE, TryCatch #7 {JSONException -> 0x06bb, blocks: (B:321:0x0693, B:324:0x06a4, B:327:0x06b5), top: B:800:0x0693 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06b5 A[Catch: JSONException -> 0x06bb, TRY_ENTER, TRY_LEAVE, TryCatch #7 {JSONException -> 0x06bb, blocks: (B:321:0x0693, B:324:0x06a4, B:327:0x06b5), top: B:800:0x0693 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0738 A[Catch: JSONException -> 0x0744, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0744, blocks: (B:339:0x06f3, B:349:0x0738), top: B:790:0x06f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0829 A[Catch: JSONException -> 0x0935, TRY_ENTER, TryCatch #19 {JSONException -> 0x0935, blocks: (B:384:0x07ed, B:394:0x0829, B:399:0x0842, B:404:0x085b), top: B:823:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[Catch: JSONException -> 0x0955, TRY_ENTER, TRY_LEAVE, TryCatch #34 {JSONException -> 0x0955, blocks: (B:44:0x00e4, B:48:0x00fb), top: B:853:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0bef A[Catch: JSONException -> 0x0cbd, TryCatch #13 {JSONException -> 0x0cbd, blocks: (B:564:0x0bd7, B:566:0x0bdd, B:567:0x0be8, B:569:0x0bef, B:571:0x0bf5, B:574:0x0bfa, B:578:0x0c05, B:580:0x0c09, B:582:0x0c23, B:593:0x0ca3, B:583:0x0c42, B:585:0x0c46, B:587:0x0c72, B:589:0x0c7d, B:590:0x0c92, B:592:0x0c98), top: B:811:0x0bd7 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0c05 A[Catch: JSONException -> 0x0cbd, TRY_ENTER, TryCatch #13 {JSONException -> 0x0cbd, blocks: (B:564:0x0bd7, B:566:0x0bdd, B:567:0x0be8, B:569:0x0bef, B:571:0x0bf5, B:574:0x0bfa, B:578:0x0c05, B:580:0x0c09, B:582:0x0c23, B:593:0x0ca3, B:583:0x0c42, B:585:0x0c46, B:587:0x0c72, B:589:0x0c7d, B:590:0x0c92, B:592:0x0c98), top: B:811:0x0bd7 }] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0c98 A[Catch: JSONException -> 0x0cbd, TryCatch #13 {JSONException -> 0x0cbd, blocks: (B:564:0x0bd7, B:566:0x0bdd, B:567:0x0be8, B:569:0x0bef, B:571:0x0bf5, B:574:0x0bfa, B:578:0x0c05, B:580:0x0c09, B:582:0x0c23, B:593:0x0ca3, B:583:0x0c42, B:585:0x0c46, B:587:0x0c72, B:589:0x0c7d, B:590:0x0c92, B:592:0x0c98), top: B:811:0x0bd7 }] */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135 A[Catch: JSONException -> 0x01b8, TRY_ENTER, TRY_LEAVE, TryCatch #21 {JSONException -> 0x01b8, blocks: (B:58:0x012c, B:61:0x0135, B:66:0x0199, B:71:0x01ac, B:73:0x01b2), top: B:827:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0d58  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0d5b A[PHI: r8
      0x0d5b: PHI (r8v16 java.lang.String) = (r8v10 java.lang.String), (r8v17 java.lang.String) binds: [B:632:0x0d59, B:630:0x0d56] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0d61 A[PHI: r8
      0x0d61: PHI (r8v15 java.lang.String) = (r8v10 java.lang.String), (r8v16 java.lang.String) binds: [B:632:0x0d59, B:634:0x0d5f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0dba  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0ea9  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0ed0  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0ede  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0f3a  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0f3c  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0f3e  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0f50 A[PHI: r8
      0x0f50: PHI (r8v18 java.lang.String) = (r8v8 java.lang.String), (r8v19 java.lang.String) binds: [B:625:0x0d46, B:623:0x0d43] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0f5a  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0f5d  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x0f65  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0f7a  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0f9d  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0fb9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0fca  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0fe4 A[LOOP:6: B:772:0x0fde->B:774:0x0fe4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0ff8  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0ffa  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x100a  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x1026  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x051c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:794:0x036b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:800:0x0693 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:802:0x0808 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:803:0x06fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:805:0x06ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0bd7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:817:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:825:0x07dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:827:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:833:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:835:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:837:0x0501 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3 A[Catch: JSONException -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #24 {JSONException -> 0x01e7, blocks: (B:78:0x01c1, B:80:0x01cd, B:83:0x01e3), top: B:833:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0790 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:857:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:867:0x0779 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.sharer.model.SharePackage r37, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r38, boolean r39, java.lang.String r40, long r41, X.InterfaceC882700Yk0 r43, int r44) {
        /*
            Method dump skipped, instruction units count: 4143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364590lc9.LJFF(com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean, java.lang.String, long, X.0Yk0, int):void");
    }

    public static boolean LIZIZ(String str) {
        return Intrinsics.LJFF("homepage_familiar", str);
    }

    public static boolean LIZJ(String str) {
        if (C13LQ.LJJIJIIJI(str, new String[]{"homepage_hot", "homepage_follow", "homepage_fresh", "hot_search_video_board", "personal_homepage", "single_song", "prop_page", "others_homepage", "homepage_nearby"}) >= 0) {
            return true;
        }
        return false;
    }

    public static void LIZ(JSONObject jSONObject, Bundle bundle) {
        if (!bundle.containsKey("cmt_poll_id")) {
            return;
        }
        try {
            jSONObject.put("cmt_poll_id", bundle.getLong("cmt_poll_id"));
            jSONObject.put("is_cmt_poll_card_show", bundle.getInt("is_cmt_poll_card_show"));
            jSONObject.put("cmt_poll_card_show_option", bundle.getString("cmt_poll_card_show_option"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJII(Bundle bundle, JSONObject jSONObject, IMContact iMContact, Aweme aweme) throws JSONException {
        String string = bundle.getString("enter_from", "");
        Map mapLIZ = C0JBR.LIZ(aweme, C1ER1.LIZIZ.fetchSearchParams(string, bundle.getString("previousPage")));
        if (mapLIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapLIZ.entrySet()) {
                if (C0Q1Q.LIZJ((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (C123100dR.LIZ((String) entry2.getValue())) {
                    jSONObject.put((String) entry2.getKey(), entry2.getValue());
                }
            }
        }
        if ((iMContact instanceof IMUser) && iMContact != null) {
            jSONObject.put("to_user_id", iMContact.getUid());
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c1er1.j(aweme, jSONObject);
        c1er1.LLILZ(aweme, string, jSONObject);
        Map<String, String> mapH0 = c1er1.h0(aweme);
        if (mapH0 != null) {
            for (Map.Entry<String, String> entry3 : mapH0.entrySet()) {
                jSONObject.put(entry3.getKey(), entry3.getValue());
            }
        }
    }

    public static void LJIIIIZZ(Object obj, String str, Boolean bool, String str2) {
        if (str != null) {
            C1599640rjG.LIZIZ.Ou(obj, new C1360330lVH(str, str2, null, bool, 4));
        }
    }

    public static void LIZLLL(SharePackage sharePackage, String str, List list, long j, InterfaceC1493105sv interfaceC1493105sv, int i) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1364600lcA(sharePackage, str, list, j, i, interfaceC1493105sv, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b3 A[Catch: JSONException -> 0x0310, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0310, blocks: (B:6:0x003a, B:8:0x005d, B:9:0x0064, B:11:0x006a, B:12:0x0071, B:14:0x0078, B:16:0x007e, B:17:0x0081, B:20:0x0089, B:26:0x00c7, B:28:0x00cd, B:30:0x00d3, B:34:0x00dc, B:36:0x00f5, B:37:0x00f8, B:39:0x00fe, B:40:0x0101, B:42:0x010a, B:44:0x0110, B:45:0x0115, B:47:0x0122, B:48:0x0127, B:50:0x012b, B:55:0x013a, B:57:0x0148, B:60:0x0151, B:62:0x0157, B:63:0x0162, B:65:0x0169, B:67:0x016f, B:71:0x0178, B:73:0x0181, B:74:0x0184, B:76:0x018e, B:78:0x0196, B:79:0x0199, B:81:0x01a1, B:82:0x01a4, B:84:0x01ae, B:86:0x01b6, B:87:0x01b9, B:89:0x01c1, B:90:0x01c4, B:92:0x01ce, B:93:0x01d3, B:95:0x01dd, B:96:0x01e2, B:98:0x01ec, B:99:0x01f1, B:101:0x01fb, B:102:0x0200, B:104:0x020a, B:105:0x020f, B:107:0x0219, B:108:0x021e, B:110:0x0228, B:111:0x022d, B:113:0x0237, B:114:0x023c, B:116:0x0246, B:117:0x024b, B:119:0x0255, B:121:0x025f, B:122:0x0264, B:124:0x0285, B:130:0x0294, B:131:0x0298, B:133:0x02a0, B:134:0x02a6, B:136:0x02b3, B:51:0x012f, B:21:0x0091, B:23:0x0095, B:25:0x00be), top: B:158:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ee A[Catch: all -> 0x02f7, TryCatch #0 {all -> 0x02f7, blocks: (B:140:0x02e4, B:141:0x02e8, B:143:0x02ee, B:144:0x02f1), top: B:154:0x02e4, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.sharer.model.SharePackage r30, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r31, boolean r32, java.lang.String r33, X.InterfaceC882700Yk0 r34, int r35) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364590lc9.LJI(com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean, java.lang.String, X.0Yk0, int):void");
    }
}

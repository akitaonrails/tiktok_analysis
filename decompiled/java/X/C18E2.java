package X;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18E2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E2 implements Application.ActivityLifecycleCallbacks, C18IL {
    public static final C18E2 LL = new C18E2();

    public static void LIZ(Activity activity) {
        PageProp pageProp;
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivityResumed", new C18HG(activity.getClass().getName()));
        Object objLIZ = C18CJ.LIZ();
        if (objLIZ != null) {
            C21248618Dk.LIZ.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(objLIZ);
            if (pageInfoStackLJIIIZ != null) {
                boolean z = C18E3.LIZ;
                C18E3.LIZLLL(EnumC21251218Ek.PausePre, pageInfoStackLJIIIZ, objLIZ);
            }
        }
        C18E9 c18e9LIZIZ = C18EN.LIZIZ(activity);
        if (c18e9LIZIZ != null) {
            c18e9LIZIZ.LLILZ = true;
            c18e9LIZIZ.LLILZLL = true;
        }
        C18EP.LJ(activity);
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ2 = C21248618Dk.LJIIIZ(activity);
        if (pageInfoStackLJIIIZ2 != null && (pageProp = pageInfoStackLJIIIZ2.getPageProp()) != null && pageProp.getAuto()) {
            C18EA.LIZ.LJ(activity, EnumC21250718Ef.System);
        }
        C18E8 c18e8 = C18E8.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.app.Activity r11) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E2.LIZJ(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivityDestroyed", new C18HC(activity.getClass().getName()));
        C18EP.LIZJ(activity);
        C18E4.LIZJ(activity);
        C21248618Dk.LIZ.getClass();
        Iterator<Map.Entry<C589920NBu<View>, C589920NBu<Dialog>>> it2 = C21248618Dk.LJIILLIIL.entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(C789730UyR.LIZIZ(it2.next().getKey().get()), activity)) {
                it2.remove();
            }
        }
        C21248618Dk.LIZ.getClass();
        Iterator it3 = ((ArrayList) C21248618Dk.LJIIZILJ).iterator();
        while (it3.hasNext()) {
            Reference reference = (Reference) it3.next();
            if (Intrinsics.LJFF(C789730UyR.LIZIZ((View) reference.get()), activity)) {
                C21248618Dk.LIZ.getClass();
                C21248618Dk.LIZIZ(reference);
                it3.remove();
            }
        }
        C18EN.LIZ.remove(new C589920NBu(activity));
        C18E8.LL.onActivityDestroyed(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityPaused(android.app.Activity r12) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E2.onActivityPaused(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        super.onActivityPostPaused(activity);
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivityPostPaused", new C18HE(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        if (C2345409Gy.LIZ()) {
            C2345409Gy.LIZIZ(new RunnableC2345109Gv(1, activity, this));
            return;
        }
        super.onActivityPostResumed(activity);
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivityPostResumed", new C18HF(activity.getClass().getName()));
        if (C18CS.LIZ.LIZIZ().LJIIJ() != 0 && (C18CS.LIZ.LIZIZ().LJIIJ() != 1 || Build.VERSION.SDK_INT < 29)) {
            return;
        }
        LIZJ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        if (C2345409Gy.LIZ()) {
            C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
            return;
        }
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        LIZ(activity);
        if ((C18CS.LIZ.LIZIZ().LJIIJ() != 1 || Build.VERSION.SDK_INT >= 29) && C18CS.LIZ.LIZIZ().LJIIJ() != 2) {
            return;
        }
        C786410Ut5.LJL((Handler) C20321214fK.LIZ.getValue(), new Runnable() { // from class: X.18GH
            @Override // java.lang.Runnable
            public final void run() {
                Activity activity2 = activity;
                C1C7U.LIZ("BtmActivityLifecycleCallbackV2@8a0.com_bytedance_android_btm_impl_page_lifecycle_layer1_outer_BtmActivityLifecycleCallbackV2__onActivityResumed$___twin___$1L");
                C18E2.LL.getClass();
                C18E2.LIZJ(activity2);
                C1C7U.LIZIZ("BtmActivityLifecycleCallbackV2@8a0.com_bytedance_android_btm_impl_page_lifecycle_layer1_outer_BtmActivityLifecycleCallbackV2__onActivityResumed$___twin___$1L");
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivityStarted", new C18HH(activity.getClass().getName()));
        C18E8 c18e8 = C18E8.LL;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivityStopped", new C18HI(activity.getClass().getName()));
        C18E8 c18e8 = C18E8.LL;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:137|(1:139)(13:140|(1:144)|145|(2:161|(2:163|(1:165)(1:167)))(2:147|(1:149))|166|170|(1:172)|173|(1:175)|176|448|177|(2:179|(25:181|(1:183)(26:184|(1:188)|189|(2:205|(1:211))(2:191|(1:193))|212|215|(1:217)|218|(1:220)|221|(1:223)(1:225)|224|442|226|(2:228|(2:230|(1:232)(13:233|(3:235|(1:237)(1:239)|238)|253|254|257|(1:259)|(1:261)|262|(1:264)(1:266)|265|454|267|(24:269|(2:271|(1:273)(4:274|(1:278)|290|(2:292|(1:294)(1:289))))(2:279|(1:285))|295|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(2:312|(9:446|314|(1:316)|317|(3:319|(4:322|438|323|320)|463)|324|344|(1:346)|(1:348))(0))(2:327|(2:329|(2:331|(1:333)(1:334))(2:335|(1:337)))(2:338|(1:340)))|349|(5:351|(1:416)(1:355)|356|(1:358)(1:415)|359)(4:417|(4:420|(3:465|422|468)(1:467)|466|418)|464|423)|360|(1:362)(1:414)|363|(1:413)(1:367)|368|(1:412)(1:372)|373|(1:375)|(1:377))(19:286|(1:288)(0)|295|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)(0)|349|(0)(0)|360|(0)(0)|363|(4:365|413|368|(5:370|412|373|(0)|(0))(0))(0))))(15:240|(1:242)(1:246)|243|(1:245)|253|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0)))(3:247|(1:249)(1:251)|250)|(1:253)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0))|(0)|212|215|(0)|218|(0)|221|(0)(0)|224|442|226|(0)(0)|(0)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0))(26:194|(24:200|(0)|212|215|(0)|218|(0)|221|(0)(0)|224|442|226|(0)(0)|(0)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0))|205|(2:207|211)|212|215|(0)|218|(0)|221|(0)(0)|224|442|226|(0)(0)|(0)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0)))(24:201|(2:203|(0))|212|215|(0)|218|(0)|221|(0)(0)|224|442|226|(0)(0)|(0)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0)))|(0)|166|170|(0)|173|(0)|176|448|177|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:181|(1:183)(26:184|(1:188)|189|(2:205|(1:211))(2:191|(1:193))|212|215|(1:217)|218|(1:220)|221|(1:223)(1:225)|224|442|226|(2:228|(2:230|(1:232)(13:233|(3:235|(1:237)(1:239)|238)|253|254|257|(1:259)|(1:261)|262|(1:264)(1:266)|265|454|267|(24:269|(2:271|(1:273)(4:274|(1:278)|290|(2:292|(1:294)(1:289))))(2:279|(1:285))|295|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(2:312|(9:446|314|(1:316)|317|(3:319|(4:322|438|323|320)|463)|324|344|(1:346)|(1:348))(0))(2:327|(2:329|(2:331|(1:333)(1:334))(2:335|(1:337)))(2:338|(1:340)))|349|(5:351|(1:416)(1:355)|356|(1:358)(1:415)|359)(4:417|(4:420|(3:465|422|468)(1:467)|466|418)|464|423)|360|(1:362)(1:414)|363|(1:413)(1:367)|368|(1:412)(1:372)|373|(1:375)|(1:377))(19:286|(1:288)(0)|295|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)(0)|349|(0)(0)|360|(0)(0)|363|(4:365|413|368|(5:370|412|373|(0)|(0))(0))(0))))(15:240|(1:242)(1:246)|243|(1:245)|253|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0)))(3:247|(1:249)(1:251)|250)|(1:253)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0))|(0)|212|215|(0)|218|(0)|221|(0)(0)|224|442|226|(0)(0)|(0)|254|257|(0)|(0)|262|(0)(0)|265|454|267|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03db, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03dc, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        r2 = new X.C098200Yq(r3);
        X.C189200o6.m2constructorimpl(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0486, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0487, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r8);
        r3 = new X.C098200Yq(r8);
        X.C189200o6.m2constructorimpl(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x054d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x054e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r9);
        r3 = new X.C098200Yq(r9);
        X.C189200o6.m2constructorimpl(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031c A[Catch: all -> 0x0336, PHI: r4
      0x031c: PHI (r4v19 java.lang.String) = (r4v20 java.lang.String), (r4v23 java.lang.String), (r4v27 java.lang.String) binds: [B:160:0x031a, B:155:0x0305, B:146:0x02e7] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {all -> 0x0336, blocks: (B:133:0x02b8, B:139:0x02ca, B:161:0x031c, B:163:0x0322, B:165:0x032a, B:167:0x0333, B:166:0x032d, B:140:0x02d3, B:142:0x02de, B:145:0x02e5, B:147:0x02e9, B:149:0x02ef, B:150:0x02f4, B:152:0x02fa, B:154:0x0301, B:156:0x0307, B:157:0x0310, B:159:0x0316), top: B:444:0x02b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0322 A[Catch: all -> 0x0336, TryCatch #5 {all -> 0x0336, blocks: (B:133:0x02b8, B:139:0x02ca, B:161:0x031c, B:163:0x0322, B:165:0x032a, B:167:0x0333, B:166:0x032d, B:140:0x02d3, B:142:0x02de, B:145:0x02e5, B:147:0x02e9, B:149:0x02ef, B:150:0x02f4, B:152:0x02fa, B:154:0x0301, B:156:0x0307, B:157:0x0310, B:159:0x0316), top: B:444:0x02b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03b7 A[Catch: all -> 0x03db, TryCatch #7 {all -> 0x03db, blocks: (B:177:0x035f, B:183:0x0371, B:205:0x03c3, B:207:0x03c9, B:209:0x03cd, B:211:0x03d3, B:212:0x03d5, B:184:0x037a, B:186:0x0385, B:189:0x038c, B:191:0x0390, B:193:0x0396, B:194:0x039b, B:196:0x03a1, B:198:0x03a8, B:200:0x03ae, B:201:0x03b7, B:203:0x03bd), top: B:448:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c3 A[Catch: all -> 0x03db, PHI: r3
      0x03c3: PHI (r3v80 java.lang.String) = (r3v81 java.lang.String), (r3v85 java.lang.String), (r3v89 java.lang.String) binds: [B:204:0x03c1, B:199:0x03ac, B:190:0x038e] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x03db, blocks: (B:177:0x035f, B:183:0x0371, B:205:0x03c3, B:207:0x03c9, B:209:0x03cd, B:211:0x03d3, B:212:0x03d5, B:184:0x037a, B:186:0x0385, B:189:0x038c, B:191:0x0390, B:193:0x0396, B:194:0x039b, B:196:0x03a1, B:198:0x03a8, B:200:0x03ae, B:201:0x03b7, B:203:0x03bd), top: B:448:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0469 A[Catch: all -> 0x0486, TryCatch #4 {all -> 0x0486, blocks: (B:226:0x0420, B:232:0x0432, B:253:0x047e, B:254:0x0480, B:233:0x0437, B:235:0x043d, B:237:0x0441, B:238:0x0446, B:240:0x0450, B:242:0x0454, B:243:0x0459, B:245:0x0462, B:247:0x0469, B:249:0x046d, B:250:0x0472), top: B:442:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x047e A[Catch: all -> 0x0486, PHI: r3
      0x047e: PHI (r3v61 com.bytedance.android.btm.api.model.BufferBtm) = 
      (r3v62 com.bytedance.android.btm.api.model.BufferBtm)
      (r3v66 com.bytedance.android.btm.api.model.BufferBtm)
      (r3v71 com.bytedance.android.btm.api.model.BufferBtm)
     binds: [B:252:0x047c, B:244:0x0460, B:234:0x043b] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x0486, blocks: (B:226:0x0420, B:232:0x0432, B:253:0x047e, B:254:0x0480, B:233:0x0437, B:235:0x043d, B:237:0x0441, B:238:0x0446, B:240:0x0450, B:242:0x0454, B:243:0x0459, B:245:0x0462, B:247:0x0469, B:249:0x046d, B:250:0x0472), top: B:442:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0529 A[Catch: all -> 0x054d, TryCatch #10 {all -> 0x054d, blocks: (B:267:0x04e5, B:273:0x04f7, B:295:0x0545, B:274:0x04fe, B:276:0x0507, B:290:0x0537, B:292:0x053b, B:294:0x0541, B:279:0x050f, B:281:0x0515, B:283:0x051c, B:285:0x0522, B:286:0x0529, B:288:0x052f), top: B:454:0x04e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0844  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r31, android.os.Bundle r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E2.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18CK.LJFF("BtmActivityLifecycleCallbackV2_onActivitySaveInstanceState", new C1701580uNg(activity.getClass().getName(), bundle));
        C18E4.LJI(bundle, activity);
        C18E9 c18e9LIZIZ = C18EN.LIZIZ(activity);
        if (c18e9LIZIZ != null) {
            C786410Ut5.LJJJI("top_node_id", c18e9LIZIZ.LLILZIL, bundle);
            C786410Ut5.LJJJI("tree_id", c18e9LIZIZ.LL, bundle);
            C786410Ut5.LJJJI("page_tree", c18e9LIZIZ.save(), bundle);
        }
        C18E8.LL.onActivitySaveInstanceState(activity, bundle);
    }
}

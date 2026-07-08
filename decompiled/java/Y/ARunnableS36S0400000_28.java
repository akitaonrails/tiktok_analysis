package Y;

import X.C09NG;
import X.C09NH;
import X.C0C9A;
import X.C1153800g8A;
import X.C1264020izw;
import X.C1323940kYa;
import X.C1871950yoT;
import X.C1872020yoa;
import X.C1891380zJo;
import X.C1891440zJu;
import X.C1897290zTL;
import X.C19227510Kb;
import X.C1954807lC;
import X.C1C7U;
import X.C20642515q3;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C238400w2;
import X.C259800zU;
import X.C418440Gaw;
import X.C538540LAe;
import X.C786410Ut5;
import X.C786890Utr;
import X.C814420VxA;
import X.EnumC19227710Kd;
import X.InterfaceC1107470evR;
import X.InterfaceC1107590evd;
import X.InterfaceC1871820yoG;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.xbridge.media.utils.AvatarUri;
import com.bytedance.ies.xbridge.media.utils.UploadImageResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.SubTitle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS36S0400000_28 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0yoZ] */
    public final void LIZ$0() {
        C1872020yoa c1872020yoa = C1872020yoa.LIZ;
        InterfaceC1107590evd interfaceC1107590evd = ((C1871950yoT) this.l0).LIZLLL;
        c1872020yoa.getClass();
        LinkedHashMap linkedHashMapLIZIZ = C1872020yoa.LIZIZ(interfaceC1107590evd);
        InterfaceC1107590evd interfaceC1107590evd2 = ((C1871950yoT) this.l0).LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC1107590evd2 != null) {
            InterfaceC1107470evR interfaceC1107470evRLIZIZ = interfaceC1107590evd2.LIZIZ();
            while (interfaceC1107470evRLIZIZ.hasNextKey()) {
                String strNextKey = interfaceC1107470evRLIZIZ.nextKey();
                InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd2.get(strNextKey);
                int i = C1323940kYa.LIZ[interfaceC1871820yoG.getType().ordinal()];
                if (i == 1) {
                    linkedHashMap.put(strNextKey, String.valueOf(interfaceC1871820yoG.asInt()));
                } else if (i == 2) {
                    linkedHashMap.put(strNextKey, String.valueOf(interfaceC1871820yoG.asBoolean()));
                } else if (i == 3) {
                    linkedHashMap.put(strNextKey, String.valueOf(interfaceC1871820yoG.asDouble()));
                } else if (i == 4) {
                    linkedHashMap.put(strNextKey, interfaceC1871820yoG.asString());
                }
            }
        }
        Integer num = ((C1871950yoT) this.l0).LJFF;
        final C09NH c09nh = (C09NH) this.l3;
        ?? r10 = new C0C9A() { // from class: X.0yoZ
            @Override // X.C0C9A
            public final Unit LIZJ(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap2, String str, Throwable th, Integer num2, Integer num3) {
                return null;
            }

            @Override // X.C0C9A
            public final void LIZ(Integer num2, Integer num3, Throwable th) {
                C09NH c09nh2 = c09nh;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                C1872000yoY c1872000yoY = new C1872000yoY();
                c1872000yoY.LIZ = c1872000yoY.LIZ;
                c1872000yoY.LIZLLL = num3;
                c09nh2.LIZ(0, message, c1872000yoY);
            }

            @Override // X.C0C9A
            public final void LIZIZ(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap2, Integer num2, Integer num3) {
                String str;
                List<String> list;
                try {
                    Gson gson = C1323630kY5.LIZ;
                    AvatarUri avatarUri = ((UploadImageResponse) GsonProtectorUtils.fromJson(C1323630kY5.LIZ, C786410Ut5.J3(jSONObject), UploadImageResponse.class)).data;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap3.put(next, jSONObject.get(next));
                    }
                    String str2 = null;
                    if (avatarUri == null || (list = avatarUri.urlList) == null || !(!list.isEmpty())) {
                        str = null;
                    } else {
                        str = (String) C13LP.LJJJLL(list);
                    }
                    C09NH c09nh2 = c09nh;
                    C1872000yoY c1872000yoY = new C1872000yoY();
                    c1872000yoY.LIZ = str;
                    if (avatarUri != null) {
                        str2 = avatarUri.uri;
                    }
                    c1872000yoY.LIZIZ = str2;
                    c1872000yoY.LIZJ = linkedHashMap3;
                    c1872000yoY.LIZLLL = num3;
                    c09nh2.LIZIZ(c1872000yoY, "");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        };
        if (num == null || !(num.intValue() == 0 || num.intValue() == 1)) {
            C1872020yoa c1872020yoa2 = C1872020yoa.LIZ;
            String str = ((C1871950yoT) this.l0).LIZ;
            if (str == null) {
                str = null;
            }
            C1872020yoa.LJIIJJI(c1872020yoa2, str, linkedHashMapLIZIZ, (LinkedHashMap) this.l1, new HashMap(), r10, ((C09NG) this.l2).LJII());
            return;
        }
        C1872020yoa c1872020yoa3 = C1872020yoa.LIZ;
        String str2 = ((C1871950yoT) this.l0).LIZ;
        if (str2 == null) {
            str2 = null;
        }
        C1872020yoa.LJIIJJI(c1872020yoa3, str2, linkedHashMapLIZIZ, (LinkedHashMap) this.l1, linkedHashMap, r10, ((C09NG) this.l2).LJII());
    }

    public final void LIZ$1() {
        if (((C238400w2) this.l0).element >= 0) {
            TuxTextView tuxTextView = (TuxTextView) this.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            Content content = ((SubTitle) this.l2).content;
            sbLIZ.append(content != null ? content.text : null);
            sbLIZ.append(' ');
            long j = ((C238400w2) this.l0).element * 1000;
            long j2 = 60;
            sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j / ((long) 3600000)) % ((long) 24)), Long.valueOf((j / ((long) C538540LAe.LLJJJIL)) % j2), Long.valueOf((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) % j2)}, 3)));
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            C238400w2 c238400w2 = (C238400w2) this.l0;
            c238400w2.element--;
            C786410Ut5.LJLIIL(1000L, ((C1897290zTL) this.l3).LJJIJ, this);
        }
    }

    public final void LIZ$2() {
        boolean z;
        int iLIZIZ;
        String[] strArr;
        String strLJI;
        List<String> list;
        int iLIZIZ2;
        C786890Utr c786890Utr = (C786890Utr) this.l0;
        c786890Utr.getClass();
        Layout layout = c786890Utr.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                if (layout.getEllipsisCount(i) > 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.l1;
            int i2 = C19227510Kb.LIZ[((EnumC19227710Kd) this.l2).ordinal()];
            if (i2 == 1) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210));
            } else if (i2 == 2) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(232));
            } else {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260));
            }
            layoutParams.width = iLIZIZ2;
            ((C786890Utr) this.l0).setMaxLines(2);
            ((C786890Utr) this.l0).setEllipsize(TextUtils.TruncateAt.END);
            C786410Ut5.l7((C786890Utr) this.l0, (ViewGroup.LayoutParams) this.l1);
            return;
        }
        C786890Utr c786890Utr2 = (C786890Utr) this.l0;
        int i3 = C19227510Kb.LIZ[((EnumC19227710Kd) this.l2).ordinal()];
        if (i3 == 1) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210));
        } else if (i3 == 2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(232));
        } else {
            if (i3 != 3) {
                throw new C1954807lC();
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260));
        }
        c786890Utr2.setMaxWidth(iLIZIZ);
        ((C786890Utr) this.l0).setEllipsize(TextUtils.TruncateAt.END);
        ((ViewGroup.LayoutParams) this.l1).width = -2;
        C786410Ut5.l7((C786890Utr) this.l0, (ViewGroup.LayoutParams) this.l1);
        C1264020izw c1264020izw = (C1264020izw) this.l3;
        C786890Utr c786890Utr3 = (C786890Utr) this.l0;
        C1153800g8A c1153800g8A = c1264020izw.LIZ;
        if (c1153800g8A == null || (list = c1153800g8A.LIZIZ) == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        C1153800g8A c1153800g8A2 = c1264020izw.LIZ;
        if (c1153800g8A2 == null || (strLJI = c1153800g8A2.LIZ) == null) {
            strLJI = C20642515q3.LJI(2131845714);
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        c786890Utr3.setText(C786410Ut5.j4(strLJI, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, Y.AObserverS188S0200000_28, androidx.lifecycle.Observer] */
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
    public static final void run$0(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PluginService@95b4.backgroundThreadObserveFirst$1");
        try {
            C259800zU c259800zU = (C259800zU) aRunnableS36S0400000_28.l0;
            ?? aObserverS188S0200000_28 = new AObserverS188S0200000_28(aRunnableS36S0400000_28.l1, (View) aRunnableS36S0400000_28.l2, (ViewPagerBottomSheetBehavior<View>) 9);
            c259800zU.element = aObserverS188S0200000_28;
            ((PluginService) aRunnableS36S0400000_28.l3).plugins.observeForever(aObserverS188S0200000_28);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PluginService@95b4.backgroundThreadObserveFirst$1");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, Y.AObserverS188S0200000_28, androidx.lifecycle.Observer] */
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
    public static final void run$1(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PluginService@95b4.backgroundThreadObserveFirstPluginData$1");
        try {
            C259800zU c259800zU = (C259800zU) aRunnableS36S0400000_28.l0;
            ?? aObserverS188S0200000_28 = new AObserverS188S0200000_28(aRunnableS36S0400000_28.l1, (View) aRunnableS36S0400000_28.l2, (ViewPagerBottomSheetBehavior<View>) 10);
            c259800zU.element = aObserverS188S0200000_28;
            ((PluginService) aRunnableS36S0400000_28.l3).plugins.observeForever(aObserverS188S0200000_28);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PluginService@95b4.backgroundThreadObserveFirstPluginData$1");
    }

    public static final void run$2(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("XUploadImageMethod@c290.handleUploadFile$1");
        try {
            aRunnableS36S0400000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XUploadImageMethod@c290.handleUploadFile$1");
    }

    public static final void run$3(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PowerDiffer@9633.dispatchUpdatesTo$$inlined$postWhenAttached$1");
        try {
            if (((RecyclerView) aRunnableS36S0400000_28.l0).getParent() != null) {
                ((C1891380zJo) aRunnableS36S0400000_28.l1).LIZJ((C21341918fZ) aRunnableS36S0400000_28.l2, (C1891440zJu) aRunnableS36S0400000_28.l3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PowerDiffer@9633.dispatchUpdatesTo$$inlined$postWhenAttached$1");
    }

    public static final void run$4(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PowerDiffer@9633.dispatchUpdatesTo$$inlined$postWhenAttached$2");
        try {
            if (((RecyclerView) aRunnableS36S0400000_28.l0).getParent() != null) {
                ((C1891380zJo) aRunnableS36S0400000_28.l1).LIZJ((C21341918fZ) aRunnableS36S0400000_28.l2, (C1891440zJu) aRunnableS36S0400000_28.l3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PowerDiffer@9633.dispatchUpdatesTo$$inlined$postWhenAttached$2");
    }

    public static final void run$5(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SpecialCardPictureManager@8a59.initSubTitle$3$currentRunnable$1");
        try {
            aRunnableS36S0400000_28.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.initSubTitle$3$currentRunnable$1");
    }

    public static final void run$6(ARunnableS36S0400000_28 aRunnableS36S0400000_28) {
        boolean zLIZ;
        C1C7U.LIZ("BigCardRelationLabelTextView@af95.bind$4");
        try {
            aRunnableS36S0400000_28.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BigCardRelationLabelTextView@af95.bind$4");
    }

    public ARunnableS36S0400000_28(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

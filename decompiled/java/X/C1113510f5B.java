package X;

import Y.ARunnableS86S0200000_17;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.setting.LiveMinusOneScreenTagsEventOptSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorClusterSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113510f5B {
    public static final Set<Integer> LJIJJ = C13LQ.LJLIIL(new Integer[]{1001, 1002, 1003, 1004});
    public final View LIZ;
    public final AbstractC1113530f5D LIZIZ;
    public final LinearLayout LIZJ;
    public final C426180GnQ LIZLLL;
    public final View LJ;
    public List<C1113610f5L> LJFF;
    public List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> LJI;
    public List<String> LJII;
    public final LinkedHashMap<String, C1113620f5M> LJIIIIZZ;
    public long LJIIIZ;
    public List<String> LJIIJ;
    public boolean LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public C197039127h LJIIZILJ;
    public PublicAreaMessageCommon.CreatorSuccessInfo.Topic LJIJ;
    public C1109770ez9 LJIJI;

    public final int LIZIZ() {
        List<Integer> hiddenIndices;
        C426180GnQ c426180GnQ = this.LIZLLL;
        int size = this.LJFF.size() - ((c426180GnQ == null || (hiddenIndices = c426180GnQ.getHiddenIndices()) == null) ? 0 : hiddenIndices.size());
        if (size >= 0) {
            return size;
        }
        return 0;
    }

    public static List LJ(AbstractC1110800f0o abstractC1110800f0o) {
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
        if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (list = creatorSuccessInfo.tags) != null) {
            ArrayList arrayList = new ArrayList();
            for (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem : list) {
                if (LJIJJ.contains(Integer.valueOf(tagItem.tagType))) {
                    arrayList.add(tagItem);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LJFF(AbstractC1110800f0o abstractC1110800f0o) {
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
        if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (list = creatorSuccessInfo.tags) != null) {
            ArrayList arrayList = new ArrayList();
            for (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem : list) {
                if (!LJIJJ.contains(Integer.valueOf(tagItem.tagType))) {
                    arrayList.add(tagItem);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static String LJI(List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Text text = ((PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) it2.next()).tagText;
            if (text != null && (str = text.key) != null && str.length() > 0) {
                arrayList.add(str);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public final void LJIILJJIL(Function0<Unit> function0) {
        Object objGg0;
        DataChannel dataChannel;
        if (!LiveMinusOneScreenTagsEventOptSetting.INSTANCE.getValue()) {
            function0.invoke();
            return;
        }
        C1109770ez9 c1109770ez9 = this.LJIJI;
        if (c1109770ez9 != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
            objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC1083260eIO.SHOW) {
            function0.invoke();
        } else {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this.LIZ, new ARunnableS86S0200000_17(this, function0, 92));
        }
    }

    public final void LJIILL(final C1109770ez9 c1109770ez9) {
        Collection<C1113620f5M> collectionValues = this.LJIIIIZZ.values();
        if (!collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((C1113620f5M) it2.next()).LIZIZ == 1) {
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this.LIZ, new Runnable() { // from class: X.0f5G
                        public final void LIZ() {
                            DataChannel dataChannel = c1109770ez9.LJIIIZ;
                            Object objGg0 = dataChannel != null ? dataChannel.gg0(LiveExtendedScreenStatus.class) : null;
                            if (LiveMinusOneScreenTagsEventOptSetting.INSTANCE.getValue()) {
                                if (objGg0 != EnumC1083260eIO.SHOW) {
                                    this.LJIILL(c1109770ez9);
                                    return;
                                } else {
                                    C1113510f5B c1113510f5B = this;
                                    c1113510f5B.LJIIJJI = true;
                                    c1113510f5B.LJIILJJIL = true;
                                }
                            } else if (objGg0 == EnumC1083260eIO.HIDE) {
                                return;
                            }
                            for (C1113620f5M c1113620f5M : this.LJIIIIZZ.values()) {
                                if (c1113620f5M.LIZIZ == 1) {
                                    c1113620f5M.LIZIZ = 2;
                                    c1113620f5M.LIZ.invoke();
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SubviewTagBinder@8156.scheduleShowReports$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SubviewTagBinder@8156.scheduleShowReports$2");
                        }
                    });
                    return;
                }
            }
        }
    }

    public C1113510f5B(View view, AbstractC1113530f5D abstractC1113530f5D) {
        this.LIZ = view;
        this.LIZIZ = abstractC1113530f5D;
        this.LIZJ = (LinearLayout) view.findViewById(R.id.i1i);
        this.LIZLLL = (C426180GnQ) view.findViewById(R.id.c3v);
        this.LJ = view.findViewById(R.id.wmz);
        C13BV c13bv = C13BV.INSTANCE;
        this.LJFF = c13bv;
        this.LJI = c13bv;
        this.LJII = c13bv;
        this.LJIIIIZZ = new LinkedHashMap<>();
        this.LJIIJ = c13bv;
        this.LJIILLIIL = "";
    }

    public final void LIZLLL(String str, Function0<Unit> function0) {
        C1113620f5M c1113620f5M = this.LJIIIIZZ.get(str);
        if (c1113620f5M != null && c1113620f5M.LIZIZ >= 1) {
            return;
        }
        this.LJIIIIZZ.put(str, new C1113620f5M(function0));
    }

    public final void LJIIIIZZ(C1109770ez9 c1109770ez9, boolean z) {
        Object objGg0;
        if (!z) {
            return;
        }
        if (LiveMinusOneScreenTagsEventOptSetting.INSTANCE.getValue()) {
            DataChannel dataChannel = c1109770ez9.LJIIIZ;
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
            } else {
                objGg0 = null;
            }
            if (objGg0 != EnumC1083260eIO.SHOW) {
                return;
            }
        }
        C0JT6<Boolean> c0jt6 = InterfaceC1106030et7.t4;
        Boolean boolLIZ = c0jt6.LIZ();
        if (boolLIZ != null && boolLIZ.booleanValue()) {
            return;
        }
        String strCrmGuideSchema = LiveMinusOneScreenTipsInFeedSetting.INSTANCE.crmGuideSchema();
        if (strCrmGuideSchema.length() == 0) {
            return;
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LIZ.getContext(), strCrmGuideSchema, AFwS254S0000000_17.get$arr$(468));
        c0jt6.LIZJ(Boolean.TRUE);
    }

    public final void LJIIJJI(AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, String str) {
        if (!(abstractC1110800f0o instanceof AbstractC1110790f0n) || abstractC1110800f0o == null || abstractC1110800f0o.LJIILJJIL.LIZJ != 1) {
            return;
        }
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> listLJFF = LJFF(abstractC1110800f0o);
        if (listLJFF.isEmpty()) {
            return;
        }
        int size = listLJFF.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(0);
        }
        int size2 = listLJFF.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(str);
        }
        LJIILIIL(abstractC1110800f0o, listLJFF, arrayList, arrayList2, "negative_page_feed");
    }

    public static String LIZ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        if (actionButton.buttonType == 1) {
            if (z) {
                Text text = actionButton.buttonInactiveText;
                if (text != null && (str4 = text.defaultPattern) != null && str4.length() > 0) {
                    return str4;
                }
                return C497740JfY.LJIJI(2131854907);
            }
            Text text2 = actionButton.buttonActiveText;
            if (text2 != null && (str3 = text2.defaultPattern) != null && str3.length() > 0) {
                return str3;
            }
            return C497740JfY.LJIJI(2131854906);
        }
        if (!(!topic.LIZ) && actionButton.enableButtonInactiveText) {
            Text text3 = actionButton.buttonInactiveText;
            if (text3 != null && (str2 = text3.defaultPattern) != null) {
                return str2;
            }
        } else {
            Text text4 = actionButton.buttonActiveText;
            if (text4 != null && (str = text4.defaultPattern) != null) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v24, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.0GnQ, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0GnQ, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final X.C1109770ez9 r42, X.AbstractC1110800f0o<? extends X.AbstractC1136060ffY> r43, boolean r44) {
        /*
            Method dump skipped, instruction units count: 2116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113510f5B.LIZJ(X.0ez9, X.0f0o, boolean):void");
    }

    public final void LJII(AbstractC1110800f0o abstractC1110800f0o, String str, String str2) {
        long jLLIIJI;
        String strJ3;
        AbstractC1110800f0o abstractC1110800f0o2 = abstractC1110800f0o;
        String strCrmDetailSchema = LiveMinusOneScreenTipsInFeedSetting.INSTANCE.crmDetailSchema();
        if (strCrmDetailSchema.length() == 0) {
            return;
        }
        if (!(abstractC1110800f0o2 instanceof AbstractC1110790f0n)) {
            abstractC1110800f0o2 = null;
        }
        List<C1113610f5L> list = this.LJFF;
        if (abstractC1110800f0o2 != null) {
            jLLIIJI = abstractC1110800f0o2.LLIIJI();
        } else {
            jLLIIJI = 0;
        }
        JSONArray jSONArray = new JSONArray();
        for (C1113610f5L c1113610f5L : list) {
            jSONArray.put(new JSONObject().put("tag_text", c1113610f5L.LIZ).put("tag_type", String.valueOf(c1113610f5L.LIZIZ)).put("tag_id", c1113610f5L.LIZJ));
        }
        String string = jSONArray.toString();
        if (abstractC1110800f0o2 != null) {
            String strLIZ = C1113520f5C.LIZ(abstractC1110800f0o2);
            JSONObject jSONObject = new JSONObject();
            C1142400fpm c1142400fpmLJ = C1136820fgm.LJ(abstractC1110800f0o2.LLIIIILZ().LJIIIZ);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("user_grade", Integer.valueOf(C1110670f0b.LIZ(abstractC1110800f0o2.getUser(), c1142400fpmLJ)));
            linkedHashMap.put("page_name", "negative_screen");
            linkedHashMap.put("msg_type", strLIZ);
            linkedHashMap.put("log_id", abstractC1110800f0o2.LLII());
            linkedHashMap.put("anchor_cluster_level", LiveAnchorClusterSetting.INSTANCE.getValue());
            linkedHashMap.put("source_tag_id", str);
            linkedHashMap.put("source_tag_show_type", str2);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                jSONObject.put(str3, value);
            }
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = C786410Ut5.J3(new JSONObject());
        }
        try {
            Uri uri = UriProtector.parse(strCrmDetailSchema);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str4 = (String) obj;
                if (!Intrinsics.LJFF(str4, "target_user_id") && !Intrinsics.LJFF(str4, "source_page") && !Intrinsics.LJFF(str4, "tags") && !Intrinsics.LJFF(str4, "extra_map")) {
                    arrayList.add(obj);
                }
            }
            for (String str5 : arrayList) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str5).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str5, it2.next());
                }
            }
            builderClearQuery.appendQueryParameter("target_user_id", String.valueOf(jLLIIJI));
            builderClearQuery.appendQueryParameter("source_page", "negative_page_tag_click");
            builderClearQuery.appendQueryParameter("tags", string);
            builderClearQuery.appendQueryParameter("extra_map", strJ3);
            strCrmDetailSchema = builderClearQuery.build().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LIZ.getContext(), strCrmDetailSchema);
    }

    public final void LJIIIZ(AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, int i, String str, int i2) {
        Object objGg0;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic;
        Text text;
        DataChannel dataChannel;
        String str2 = null;
        if (!(abstractC1110800f0o instanceof AbstractC1110790f0n) || abstractC1110800f0o == null || abstractC1110800f0o.LJIILJJIL.LIZJ != 1) {
            return;
        }
        C1109770ez9 c1109770ez9 = this.LJIJI;
        if (c1109770ez9 != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
            objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
        } else {
            objGg0 = null;
        }
        if (LiveMinusOneScreenTagsEventOptSetting.INSTANCE.getValue()) {
            if (objGg0 != EnumC1083260eIO.SHOW) {
                return;
            }
        } else if (objGg0 == EnumC1083260eIO.HIDE) {
            return;
        }
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
        if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (topic = creatorSuccessInfo.topic) != null && (text = topic.topicText) != null) {
            str2 = text.key;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String strLIZ = C1113520f5C.LIZ(abstractC1110800f0o);
        if (i == 1) {
            str3 = str2;
        }
        C1113520f5C.LJ(abstractC1110800f0o, strLIZ, str2, str3, i, str, "negative_page_feed", Integer.valueOf(i2), null, 1, i, 256);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r8.add(0);
        r1 = r16.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r1.length() <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (java.lang.Boolean.valueOf(r3).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        r1 = "AlreadyShown";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.AbstractC1110790f0n r12, java.util.List<com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> r13, java.util.List<com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> r14, java.util.List<java.lang.Integer> r15, java.util.Map<com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, java.lang.String> r16) {
        /*
            r11 = this;
            r7 = r13
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            return
        L8:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r7.size()
            r8.<init>(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = r7.size()
            r9.<init>(r0)
            java.util.Iterator r6 = r7.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r5 = r6.next()
            java.util.Iterator r4 = r14.iterator()
            r3 = 0
            r2 = 0
        L2e:
            boolean r0 = r4.hasNext()
            r1 = 1
            if (r0 == 0) goto L65
            java.lang.Object r0 = r4.next()
            if (r0 != r5) goto L62
            if (r2 < 0) goto L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = r15
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L55
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.add(r0)
            java.lang.String r0 = "Folded"
            r9.add(r0)
            goto L1e
        L55:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.add(r0)
            java.lang.String r0 = ""
            r9.add(r0)
            goto L1e
        L62:
            int r2 = r2 + 1
            goto L2e
        L65:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.add(r0)
            r0 = r16
            java.lang.Object r1 = r0.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L8b
            int r0 = r1.length()
            if (r0 <= 0) goto L7d
            r3 = 1
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8b
        L87:
            r9.add(r1)
            goto L1e
        L8b:
            java.lang.String r1 = "AlreadyShown"
            goto L87
        L8e:
            java.lang.String r10 = "negative_page_feed"
            r6 = r12
            r5 = r11
            r5.LJIILIIL(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113510f5B.LJIIJ(X.0f0n, java.util.List, java.util.List, java.util.List, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[PHI: r5
      0x0089: PHI (r5v7 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:38:0x0087, B:36:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[PHI: r5
      0x008d: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String) binds: [B:38:0x0087, B:40:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.AbstractC1110790f0n r30, java.util.List<com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> r31, java.util.List<java.lang.Integer> r32, java.util.List<java.lang.String> r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113510f5B.LJIILIIL(X.0f0n, java.util.List, java.util.List, java.util.List, java.lang.String):void");
    }

    public static void LJIIL(C1113510f5B c1113510f5B, AbstractC1110800f0o abstractC1110800f0o, String str, String str2, int i, String str3, String str4, String str5, Integer num, int i2, int i3, String str6, int i4) {
        String str7 = str6;
        int i5 = i3;
        int i6 = i2;
        Integer num2 = null;
        if ((i4 & 128) == 0) {
            num2 = num;
        }
        if ((i4 & 256) != 0) {
            i6 = 0;
        }
        if ((i4 & 512) != 0) {
            i5 = 0;
        }
        if ((i4 & 1024) != 0) {
            str7 = "";
        }
        c1113510f5B.getClass();
        if ((abstractC1110800f0o instanceof AbstractC1110790f0n) && abstractC1110800f0o != null) {
            C1113520f5C.LIZLLL("livesdk_companion_tool_label_click", abstractC1110800f0o, C1113520f5C.LIZ(abstractC1110800f0o), str, str2, i, str3, str4, str5, num2, str7, i6, i5);
        }
    }
}

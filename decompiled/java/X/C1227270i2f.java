package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.uitls.LiveTemplateHelper$startChatWithCheckFollowStatus$1$onSuccess$1", f = "LiveTemplateHelper.kt", l = {}, m = "invokeSuspend")
public final class C1227270i2f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<IMUser> LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ C0Y8T LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1227250i2d LLILZIL;
    public final /* synthetic */ AbstractC1225780i0G LLILZLL;
    public final /* synthetic */ AbstractC1225770i0F LLIZ;
    public final /* synthetic */ Fragment LLIZLLLIL;
    public final /* synthetic */ C1227860i3c LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1227270i2f(List<? extends IMUser> list, C0Y8T c0y8t, C0Y8T c0y8t2, String str, InterfaceC1227250i2d interfaceC1227250i2d, AbstractC1225780i0G abstractC1225780i0G, AbstractC1225770i0F abstractC1225770i0F, Fragment fragment, C1227860i3c c1227860i3c, String str2, InterfaceC1364105Vn<? super C1227270i2f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c0y8t;
        this.LLILLL = c0y8t2;
        this.LLILZ = str;
        this.LLILZIL = interfaceC1227250i2d;
        this.LLILZLL = abstractC1225780i0G;
        this.LLIZ = abstractC1225770i0F;
        this.LLIZLLLIL = fragment;
        this.LLJ = c1227860i3c;
        this.LLJI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1227270i2f(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("LiveTemplateHelper@ba38.startChatWithCheckFollowStatus$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IMUser> list = this.LL;
        if (!list.isEmpty()) {
            C0Y8T c0y8t = this.LLILLJJLI;
            C0Y8T c0y8t2 = this.LLILLL;
            final String str3 = this.LLILZ;
            final InterfaceC1227250i2d interfaceC1227250i2d = this.LLILZIL;
            final AbstractC1225780i0G abstractC1225780i0G = this.LLILZLL;
            final AbstractC1225770i0F abstractC1225770i0F = this.LLIZ;
            final Fragment fragment = this.LLIZLLLIL;
            C1227860i3c c1227860i3c = this.LLJ;
            String str4 = this.LLJI;
            String conversationId = c0y8t.getConversationId();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<IMUser> it2 = list.iterator();
            while (it2.hasNext()) {
                String uid = it2.next().getUid();
                if (uid == null) {
                    uid = "";
                }
                arrayList.add(uid);
            }
            List<Long> listLJFF = C866950Xzh.LJFF(arrayList);
            long jLIZJ = C461720I8s.LIZJ();
            if (!C1229100i5c.LIZ.LJIIL(c0y8t2)) {
                str = "";
            } else {
                str = "send_invite";
            }
            C0YUN.LIZIZ(new C873240YNm(conversationId, listLJFF, C1229420i68.LIZ(jLIZJ, str, null, null, 26), false, 120), new InterfaceC867020Xzo<List<? extends C0YAE>>() { // from class: X.0i2e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC867020Xzo
                public final void LIZ(C868810Y6l<List<? extends C0YAE>> c868810Y6l) {
                    Activity activityLIZIZ;
                    Activity activityLIZ;
                    C1226960i2A c1226960i2A;
                    Function1<AbstractC1225770i0F, Map<String, String>> function1;
                    C1227540i36 c1227540i36LJJIFFI;
                    Integer numValueOf;
                    List<? extends C0YAE> list2 = c868810Y6l.LIZ;
                    C0YMW c0ymw = c868810Y6l.LIZIZ;
                    C742250T9r c742250T9r = c868810Y6l.LIZJ;
                    IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
                    Map<String, String> mapInvoke = null;
                    if (iMGroupChatApiLIZ != null && (c1227540i36LJJIFFI = iMGroupChatApiLIZ.LJJIFFI()) != null) {
                        String str5 = str3;
                        if (c0ymw != null) {
                            numValueOf = Integer.valueOf(c0ymw.getCode());
                        } else {
                            numValueOf = null;
                        }
                        c1227540i36LJJIFFI.LJIILIIL(str5, c742250T9r, numValueOf);
                    }
                    if (c0ymw != null) {
                        IIMErrorUtils.LIZ.getClass();
                        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                        if (iIMErrorUtilsLIZ != null) {
                            C0I0B.LJFF.LIZJ();
                            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                        }
                    } else {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                            String string = fragment.getString(2131835234);
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIJ(string);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                    InterfaceC1227250i2d interfaceC1227250i2d2 = interfaceC1227250i2d;
                    if (interfaceC1227250i2d2 != 0) {
                        String str6 = str3;
                        AbstractC1225780i0G abstractC1225780i0G2 = abstractC1225780i0G;
                        if ((abstractC1225780i0G2 instanceof C1226960i2A) && (c1226960i2A = (C1226960i2A) abstractC1225780i0G2) != null && (function1 = c1226960i2A.LLJJI) != null) {
                            mapInvoke = function1.invoke(abstractC1225770i0F);
                        }
                        interfaceC1227250i2d2.LIZJ(list2, str6, null, null, mapInvoke);
                    }
                }

                @Override // X.InterfaceC867020Xzo
                public final void LIZIZ(C0Y00 c0y00) {
                    Map<String, String> mapInvoke;
                    C1226960i2A c1226960i2A;
                    Function1<AbstractC1225770i0F, Map<String, String>> function1;
                    C1227540i36 c1227540i36LJJIFFI;
                    C742250T9r c742250T9r = c0y00.LIZIZ;
                    C0YMW c0ymw = c0y00.LIZ;
                    IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
                    if (iMGroupChatApiLIZ != null && (c1227540i36LJJIFFI = iMGroupChatApiLIZ.LJJIFFI()) != null) {
                        c1227540i36LJJIFFI.LJIILIIL(str3, c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
                    }
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                    InterfaceC1227250i2d interfaceC1227250i2d2 = interfaceC1227250i2d;
                    if (interfaceC1227250i2d2 != null) {
                        String str5 = str3;
                        AbstractC1225780i0G abstractC1225780i0G2 = abstractC1225780i0G;
                        if ((abstractC1225780i0G2 instanceof C1226960i2A) && (c1226960i2A = (C1226960i2A) abstractC1225780i0G2) != null && (function1 = c1226960i2A.LLJJI) != null) {
                            mapInvoke = function1.invoke(abstractC1225770i0F);
                        } else {
                            mapInvoke = null;
                        }
                        interfaceC1227250i2d2.LIZJ(null, str5, null, null, mapInvoke);
                    }
                }
            });
            for (IMUser iMUser : list) {
                if (c1227860i3c != null) {
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    C1227860i3c.LIZ(str4, str2, String.valueOf(iMUser.getUid()), null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveTemplateHelper@ba38.startChatWithCheckFollowStatus$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

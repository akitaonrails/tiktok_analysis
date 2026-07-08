package X;

import Y.ACListenerS31S1300000_21;
import Y.ACListenerS56S0400000_21;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PersonInfo;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.photopager.AmberAlertImageCell;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.share.AmberAlertShareConfiguration;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.share.AmberAlertSharePackage;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS220S0000000_31;
import kotlin.jvm.internal.AwS275S0000000_31;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.166A, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166A extends C1617910sCj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LL;
    public final C166U LLILLJJLI;
    public final C166U LLILLL;
    public AmberAlertCardInfo LLILZ;
    public IViewPagerComponentAbility LLILZIL;
    public C19EG LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C166A.class, "_binding", "get_binding()Lcom/ss/android/ugc/aweme/compliance/protection/databinding/ComplianceProtectionLayoutAmberAlertCardV1Binding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C166A.class, "_binding2", "get_binding2()Lcom/ss/android/ugc/aweme/compliance/protection/databinding/ComplianceProtectionLayoutAmberAlertCardV2Binding;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final C339301Tj getColorManager() {
        return (C339301Tj) this.LLJJ.getValue();
    }

    private final C0HH4 getGalleryManager() {
        return (C0HH4) this.LLJILLL.getValue();
    }

    private final C166K getImageManager() {
        return (C166K) this.LLJILJIL.getValue();
    }

    private final C15542066q getMusicManager() {
        return (C15542066q) this.LLJILJILJ.getValue();
    }

    private final C166M get_binding() {
        C166U c166u = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (C166M) c166u.LIZ(this);
    }

    private final C166C get_binding2() {
        C166U c166u = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (C166C) c166u.LIZ(this);
    }

    public final void B0() {
        C1389390mG9 c1389390mG9 = C1389390mG9.LIZ;
        AmberAlertCardInfo amberAlertCardInfo = this.LLILZ;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 382);
        c1389390mG9.getClass();
        C1389390mG9.LIZIZ(amberAlertCardInfo, "tt_amber_alert_dismiss", awS610S0100000_31);
        this.LLJ = true;
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            InterfaceC497601wk interfaceC497601wk = musicManager.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C15540066o(musicManager, null), 2);
        }
    }

    public final C166B getBinding() {
        return (C166B) this.LL.getValue();
    }

    public final C1380980m2a getViewManager() {
        return (C1380980m2a) this.LLJIJIL.getValue();
    }

    public final void C0() {
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            musicManager.LIZ();
        }
    }

    public final C166B i0() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "amber_alert_redesign", true) != 1) {
            C786410Ut5.Sd(R.layout.bf4, C786410Ut5.ne(getContext()), this);
            return new C166D(get_binding2());
        }
        C786410Ut5.Sd(R.layout.bf3, C786410Ut5.ne(getContext()), this);
        final C166M c166m = get_binding();
        return new C166B(c166m) { // from class: X.166L
            public final C166M LIZ;

            @Override // X.C166B
            public final ViewOnAttachStateChangeListenerC20631115oD LIZ() {
                return this.LIZ.LLIZ;
            }

            @Override // X.C166B
            public final ViewGroup LIZIZ() {
                return this.LIZ.LLILLJJLI;
            }

            @Override // X.C166B
            public final TuxTextView LIZJ() {
                return this.LIZ.LLILZIL;
            }

            @Override // X.C166B
            public final C197039127h LIZLLL() {
                return this.LIZ.LLJIJIL;
            }

            @Override // X.C166B
            public final ConstraintLayout LJ() {
                return this.LIZ.LLJI;
            }

            @Override // X.C166B
            public final TuxTextView LJFF() {
                return this.LIZ.LLILLL;
            }

            @Override // X.C166B
            public final LinearLayout LJI() {
                return this.LIZ.LLILZLL;
            }

            @Override // X.C166B
            public final TuxTextView LJII() {
                return this.LIZ.LLILZ;
            }

            @Override // X.C166B
            public final C1087110eOb LJIIIIZZ() {
                return this.LIZ.LLJ;
            }

            @Override // X.C166B
            public final ConstraintLayout getRoot() {
                return this.LIZ.LL;
            }

            {
                this.LIZ = c166m;
            }
        };
    }

    public final void n0() {
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            InterfaceC497601wk interfaceC497601wk = musicManager.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C15539066n(musicManager, null), 2);
            C20498815Ja c20498815Ja = musicManager.LIZJ;
            if (c20498815Ja != null) {
                c20498815Ja.release();
            }
            musicManager.LIZJ = null;
        }
        this.LLJI = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            InterfaceC497601wk interfaceC497601wk = musicManager.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C15539066n(musicManager, null), 2);
            C20498815Ja c20498815Ja = musicManager.LIZJ;
            if (c20498815Ja != null) {
                c20498815Ja.release();
            }
            musicManager.LIZJ = null;
        }
    }

    public final void p0() {
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            InterfaceC497601wk interfaceC497601wk = musicManager.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C15540066o(musicManager, null), 2);
        }
        if (this.LLJ) {
            return;
        }
        C1389390mG9 c1389390mG9 = C1389390mG9.LIZ;
        AmberAlertCardInfo amberAlertCardInfo = this.LLILZ;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 379);
        c1389390mG9.getClass();
        C1389390mG9.LIZIZ(amberAlertCardInfo, "tt_amber_alert_dismiss", awS610S0100000_31);
        this.LLJ = true;
    }

    public final void s0() {
        this.LLIZLLLIL = System.currentTimeMillis();
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            musicManager.LIZ();
        }
    }

    public final void z0() {
        C15542066q musicManager = getMusicManager();
        if (musicManager != null) {
            InterfaceC497601wk interfaceC497601wk = musicManager.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C15539066n(musicManager, null), 2);
        }
    }

    public static int e0(AmberAlertCardInfo amberAlertCardInfo) {
        int i;
        int size;
        int size2;
        if (amberAlertCardInfo == null) {
            return 0;
        }
        List<PersonInfo> list = amberAlertCardInfo.children;
        if (list != null) {
            Iterator<PersonInfo> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                List<String> list2 = it2.next().images;
                if (list2 != null) {
                    size2 = list2.size();
                } else {
                    size2 = 0;
                }
                i += size2;
            }
        } else {
            i = 0;
        }
        List<PersonInfo> list3 = amberAlertCardInfo.suspects;
        if (list3 != null) {
            Iterator<PersonInfo> it3 = list3.iterator();
            while (it3.hasNext()) {
                List<String> list4 = it3.next().images;
                if (list4 != null) {
                    size = list4.size();
                } else {
                    size = 0;
                }
                i += size;
            }
        }
        return i;
    }

    public static List h0(PersonInfo... personInfoArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (personInfoArr.length == 1) {
            List<String> list = ((PersonInfo) C13LQ.LJIL(personInfoArr)).images;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0HFW(it2.next()));
                }
            }
        } else {
            for (PersonInfo personInfo : personInfoArr) {
                List<String> list2 = personInfo.images;
                if (list2 != null && (str = (String) C13LP.LJJJJZI(list2)) != null) {
                    arrayList.add(new C0HFW(str));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupClickListeners(AmberAlertCardInfo amberAlertCardInfo) {
        BaseTemplate baseTemplateLIZIZ;
        C1380980m2a viewManager = getViewManager();
        C197039127h c197039127hLIZLLL = getBinding().LIZLLL();
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(amberAlertCardInfo, 1303);
        viewManager.getClass();
        String str = null;
        Object[] objArr = 0;
        if (amberAlertCardInfo != null) {
            AmberAlertSharePackage.Companion.getClass();
            String str2 = "pns_amber_alert";
            String str3 = amberAlertCardInfo.contentPb;
            if (str3 != null && (baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, str3)) != null) {
                C1389390mG9.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C1389390mG9.LIZ(amberAlertCardInfo).LIZ);
                linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("specific_page", "feed_card"), new Pair("event_name", "tt_amber_alert_share_initiated"), new Pair("share_type", "internal_messaging")));
                C1227904rF.LIZ.getClass();
                SendMessageTemplateTask sendMessageTemplateTask = new SendMessageTemplateTask(str2, baseTemplateLIZIZ, new SendMessageEventParcel("homepage_hot", null, null, null, null, C1227904rF.LJI(linkedHashMap), 30), objArr == true ? 1 : 0, false, 24);
                C2089008Gi c2089008Gi = new C2089008Gi(amberAlertCardInfo.detailPageLink);
                C1370940lmO c1370940lmO = new C1370940lmO();
                c1370940lmO.LJIIIIZZ = sendMessageTemplateTask;
                c1370940lmO.LJFF = c2089008Gi.LJ();
                new SharePackage(c1370940lmO);
                AmberAlertSharePackage amberAlertSharePackage = new AmberAlertSharePackage(c1370940lmO, amberAlertCardInfo);
                C1380930m2V c1380930m2V = AmberAlertShareConfiguration.LLILLJJLI;
                c197039127hLIZLLL.setClickable(true);
                C786410Ut5.U8(c197039127hLIZLLL, new ACListenerS56S0400000_21(awS565S0100000_21, viewManager, amberAlertSharePackage, c1380930m2V, 1));
            }
        }
        C1380980m2a viewManager2 = getViewManager();
        ViewGroup viewGroupLIZIZ = getBinding().LIZIZ();
        if (amberAlertCardInfo != null) {
            str = amberAlertCardInfo.detailPageLink;
        }
        AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(amberAlertCardInfo, 1304);
        viewManager2.getClass();
        C786410Ut5.K7(viewGroupLIZIZ, new ACListenerS31S1300000_21(awS565S0100000_212, viewManager2, viewGroupLIZIZ, str, 1));
    }

    private final void setupImagePagerListener(Function1<? super Integer, Unit> function1) {
        getBinding().LIZ().registerOnPageChangeCallback(new C16H0(function1, 4));
    }

    private final void setupView(AmberAlertCardInfo amberAlertCardInfo) {
        C166K imageManager = getImageManager();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLIZ = getBinding().LIZ();
        imageManager.getClass();
        viewOnAttachStateChangeListenerC20631115oDLIZ.getViewItemOperator().LIZJ(AmberAlertImageCell.class);
        setupClickListeners(amberAlertCardInfo);
        setupImagePagerListener(new AwS387S0200000_21(amberAlertCardInfo, this, 64));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(List<C0HFW> list) {
        C166D c166d;
        GradientDrawable gradientDrawable;
        int i;
        String str;
        C0HH4 galleryManager = getGalleryManager();
        C166B binding = getBinding();
        galleryManager.getClass();
        ConstraintLayout constraintLayoutLJ = binding.LJ();
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 1) {
            C786410Ut5.LJJJLZIJ(binding.LIZ(), constraintLayoutLJ);
            C19ME c19meLIZIZ = C1636506ax.LIZIZ(constraintLayoutLJ);
            if (c19meLIZIZ != null) {
                c19meLIZIZ.dimensionRatio = "390:395";
            }
            if (arrayList.size() == 3) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(constraintLayoutLJ.getContext()), R.layout.bez, constraintLayoutLJ, false);
                constraintLayoutLJ.addView(viewTd, 0);
                C0HH4.LIZ((SmartImageView) viewTd.findViewById(R.id.l5d), (C0HFW) ListProtector.get(list, 0));
                C0HH4.LIZ((SmartImageView) viewTd.findViewById(R.id.l5j), (C0HFW) ListProtector.get(list, 1));
                C0HH4.LIZ((SmartImageView) viewTd.findViewById(R.id.l5p), (C0HFW) ListProtector.get(list, 2));
            } else {
                View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(constraintLayoutLJ.getContext()), R.layout.bey, constraintLayoutLJ, false);
                constraintLayoutLJ.addView(viewTd2, 0);
                C19MV c19mv = (C19MV) viewTd2.findViewById(R.id.j5p);
                List listLJIIJJI = C1697810uHb.LJIIJJI(viewTd2.findViewById(R.id.l58), viewTd2.findViewById(R.id.l59), viewTd2.findViewById(R.id.l5_), viewTd2.findViewById(R.id.f738l5a), viewTd2.findViewById(R.id.l5b), viewTd2.findViewById(R.id.l5c));
                int i2 = 0;
                for (Object obj : listLJIIJJI) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        SmartImageView smartImageView = (SmartImageView) obj;
                        if (i2 < arrayList.size()) {
                            C786410Ut5.LLFF(0, smartImageView);
                            C0HH4.LIZ(smartImageView, (C0HFW) ListProtector.get(list, i2));
                        } else {
                            C786410Ut5.LLFF(8, smartImageView);
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                if (arrayList.size() != 2 && arrayList.size() != 4) {
                    i = 3;
                } else {
                    i = 2;
                }
                c19mv.setMaxElementsWrap(i);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listLJIIJJI) {
                    if (((View) obj2).getVisibility() == 0) {
                        arrayList2.add(obj2);
                    }
                }
                int i4 = 0;
                for (Object obj3 : arrayList2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C19ME c19meLIZIZ2 = C1636506ax.LIZIZ((View) obj3);
                        if (c19meLIZIZ2 != null) {
                            int size = arrayList.size();
                            if (size != 2) {
                                if (size == 5 ? i4 >= 3 : size != 6) {
                                    str = "195:197.5";
                                } else {
                                    str = "130:198";
                                }
                            } else {
                                str = "195:395";
                            }
                            c19meLIZIZ2.dimensionRatio = str;
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((View) it2.next()).getId()));
                }
                c19mv.setReferencedIds(C13LP.LLII(arrayList3));
            }
        }
        C1380980m2a viewManager = getViewManager();
        C166B binding2 = getBinding();
        viewManager.getClass();
        if ((binding2 instanceof C166D) && (c166d = (C166D) binding2) != null) {
            C786410Ut5.LJZI(0, c166d.LIZ.LLILZ);
            C786410Ut5.LJZI(0, c166d.LIZ.LLILZIL);
            C786410Ut5.LJZI(0, c166d.LIZ.LLILLL);
            Drawable background = c166d.LIZ.LLJJ.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColors(new int[]{0, 0, ColorProtector.parseColor("#FF261B13")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            }
            C19ME c19meLIZIZ3 = C1636506ax.LIZIZ(c166d.LIZ.LLJILJIL);
            if (c19meLIZIZ3 != null) {
                ((ViewGroup.MarginLayoutParams) c19meLIZIZ3).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(99));
            }
        }
        C786410Ut5.LJLLLLLL(0, getBinding().getRoot());
    }

    public final void u0(int i) {
        AmberAlertCardInfo amberAlertCardInfo;
        if (!this.LLIZ && (amberAlertCardInfo = this.LLILZ) != null) {
            Keva keva = C20548715av.LIZ;
            C20548715av.LIZIZ(amberAlertCardInfo.lastUpdateTime, amberAlertCardInfo.alertId);
            this.LLIZ = true;
        }
        C1389390mG9 c1389390mG9 = C1389390mG9.LIZ;
        AmberAlertCardInfo amberAlertCardInfo2 = this.LLILZ;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 380);
        c1389390mG9.getClass();
        C1389390mG9.LIZIZ(amberAlertCardInfo2, "tt_amber_alert_view", awS610S0100000_31);
        this.LLIZLLLIL = System.currentTimeMillis();
        if (this.LLJI) {
            C15542066q musicManager = getMusicManager();
            if (musicManager != null) {
                C20498815Ja c20498815Ja = new C20498815Ja("amber_alert_music");
                musicManager.LIZJ = c20498815Ja;
                c20498815Ja.LIZJ(new InterfaceC1485110okX() { // from class: X.166H
                    @Override // X.InterfaceC1485110okX
                    public final void LIZ(int i2, int i3) {
                    }
                });
                C20498815Ja c20498815Ja2 = musicManager.LIZJ;
                if (c20498815Ja2 != null) {
                    c20498815Ja2.LJ(new InterfaceC1485120okY() { // from class: X.166I
                        @Override // X.InterfaceC1485120okY
                        public final void LIZ(int i2, int i3) {
                        }
                    });
                }
                C20498815Ja c20498815Ja3 = musicManager.LIZJ;
                if (c20498815Ja3 != null) {
                    c20498815Ja3.LIZ(new InterfaceC1485100okW() { // from class: X.166J
                        @Override // X.InterfaceC1485100okW
                        public final void LIZIZ() {
                        }
                    });
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C15537066l(musicManager.LIZIZ, musicManager, 0.5f, new AwS581S0100000_2(musicManager, 483), null), 3);
            }
            this.LLJI = false;
            return;
        }
        C15542066q musicManager2 = getMusicManager();
        if (musicManager2 == null) {
            return;
        }
        musicManager2.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #1 {Exception -> 0x0092, blocks: (B:14:0x0047, B:16:0x004d, B:18:0x0054, B:20:0x0058, B:21:0x0086), top: B:29:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(androidx.fragment.app.Fragment r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r7 = this;
            X.19EG r0 = X.C724240Sb0.LIZ(r8)
            r7.LLILZLL = r0
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r9.getCardInsertInfo()
            r3 = 0
            if (r0 == 0) goto L34
            java.lang.String r2 = r0.getCardInsertStatus()
            if (r2 == 0) goto L34
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L21
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo> r0 = com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo.class
            r1.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = X.C1227904rF.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L21
            com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo r0 = (com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo) r0     // Catch: java.lang.Throwable -> L21
            goto L35
        L21:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "parseAweme() error: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
        L34:
            r0 = r3
        L35:
            r7.LLILZ = r0
            r7.setupView(r0)
            com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo r4 = r7.LLILZ
            if (r4 == 0) goto Lb0
            java.util.List<com.ss.android.ugc.aweme.compliance.api.model.PersonInfo> r2 = r4.children
            java.util.List<com.ss.android.ugc.aweme.compliance.api.model.PersonInfo> r1 = r4.suspects
            r6 = 0
            r5 = 1
            r3 = 4
            if (r2 == 0) goto L86
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L92
            if (r0 != 0) goto L86
            r7.j0(r2, r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = r4.source     // Catch: java.lang.Exception -> L92
            if (r1 == 0) goto Lb0
            java.lang.String r0 = r4.summary     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto Lb0
            X.166G r4 = new X.166G     // Catch: java.lang.Exception -> L92
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L92
            X.0m2a r0 = r7.getViewManager()     // Catch: java.lang.Exception -> L92
            X.166B r2 = r7.getBinding()     // Catch: java.lang.Exception -> L92
            r0.getClass()     // Catch: java.lang.Exception -> L92
            com.bytedance.tux.input.TuxTextView r1 = r2.LJII()     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = r4.LIZ     // Catch: java.lang.Exception -> L92
            r1.setText(r0)     // Catch: java.lang.Exception -> L92
            com.bytedance.tux.input.TuxTextView r2 = r2.LJFF()     // Catch: java.lang.Exception -> L92
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L92
            r1[r6] = r0     // Catch: java.lang.Exception -> L92
            r0 = 2131826489(0x7f111739, float:1.9285864E38)
            java.lang.String r0 = X.C1710306mr.LIZIZ(r0, r1)     // Catch: java.lang.Exception -> L92
            r2.setText(r0)     // Catch: java.lang.Exception -> L92
            goto Lb0
        L86:
            X.166B r0 = r7.getBinding()     // Catch: java.lang.Exception -> L92
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L92
            X.C786410Ut5.LJLLLLLL(r3, r0)     // Catch: java.lang.Exception -> L92
            goto Lb0
        L92:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "renderAlertCard() error: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.166B r0 = r7.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
            X.C786410Ut5.LJLLLLLL(r3, r0)
        Lb0:
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = X.C0T1R.LIZLLL(r8)
            r7.LLILZIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166A.Y(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(List<PersonInfo> list, List<PersonInfo> list2) {
        boolean z;
        boolean z2;
        List<String> list3;
        if (list.size() == 1) {
            if (list2 != null && list2.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z && (list3 = ((PersonInfo) C13LP.LJJJJZI(list2)).images) != null && !list3.isEmpty()) {
                l0(h0(C13LP.LJJJJZI(list), C13LP.LJJJJZI(list2)));
                C1380980m2a viewManager = getViewManager();
                C166B binding = getBinding();
                viewManager.getClass();
                C786410Ut5.LLILZIL(binding.LJIIIIZZ(), 0);
            } else {
                List listH0 = h0(C13LP.LJJJJZI(list));
                C166K imageManager = getImageManager();
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLIZ = getBinding().LIZ();
                imageManager.getClass();
                viewOnAttachStateChangeListenerC20631115oDLIZ.getViewItemOperator().getState().LIZLLL(listH0, null);
                if (((ArrayList) listH0).size() > 1) {
                    final C1380980m2a viewManager2 = getViewManager();
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLIZ2 = getBinding().LIZ();
                    final LinearLayout linearLayoutLJI = getBinding().LJI();
                    viewManager2.getClass();
                    viewOnAttachStateChangeListenerC20631115oDLIZ2.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0mDu
                        @Override // X.AbstractC712240Rwk
                        public final void onPageSelected(int i) {
                            boolean z3;
                            C1380980m2a c1380980m2a = viewManager2;
                            LinearLayout linearLayout = linearLayoutLJI;
                            c1380980m2a.getClass();
                            int childCount = linearLayout.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = linearLayout.getChildAt(i2);
                                if (i2 == i) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                childAt.setSelected(z3);
                            }
                        }
                    });
                    int iLJIIIIZZ = viewOnAttachStateChangeListenerC20631115oDLIZ2.getViewItemOperator().getState().LJIIIIZZ();
                    try {
                        C786410Ut5.LJJJJJL(linearLayoutLJI);
                        Context context = linearLayoutLJI.getContext();
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.tk);
                        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.tl);
                        for (int i = 0; i < iLJIIIIZZ; i++) {
                            View view = new View(context);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                            if (i > 0) {
                                layoutParams.setMarginStart(dimensionPixelSize2);
                            }
                            C786410Ut5.W5(view, layoutParams);
                            view.setBackgroundResource(R.drawable.be3);
                            if (i == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            view.setSelected(z2);
                            linearLayoutLJI.addView(view);
                        }
                    } catch (Resources.NotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C0HFW c0hfw = (C0HFW) C13LP.LJJJJZI(listH0);
                final C339301Tj colorManager = getColorManager();
                if (colorManager != null) {
                    AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 381);
                    C166F c166f = new C166E().LIZ;
                    float[] fArr = c166f.LIZJ;
                    fArr[0] = 0.7f;
                    fArr[1] = 0.7f;
                    float[] fArr2 = c166f.LIZ;
                    fArr2[0] = 0.7f;
                    float[] fArr3 = c166f.LIZIZ;
                    fArr3[2] = 0.35f;
                    fArr2[1] = 0.9f;
                    fArr3[1] = 0.25f;
                    final C1007140cJc c1007140cJc = new C1007140cJc(c166f, colorManager, awS610S0100000_31, null);
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c0hfw.LL);
                    c1331670kl3LJIIIZ.LJJIJL(colorManager.LIZ);
                    c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.SMALL;
                    c1331670kl3LJIIIZ.LJJIIJ(new AbstractC468201s0() { // from class: X.01Ti
                        @Override // X.AbstractC468201s0, X.InterfaceC1331910klR
                        public final void onCanceled() {
                        }

                        @Override // X.AbstractC468201s0, X.InterfaceC1331910klR
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                C23250099c.LIZLLL(colorManager.LIZIZ, C0PEM.LIZ, null, new C339001Tg(c1007140cJc, bitmap, null), 2);
                            }
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            Throwable cause;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onFailed: ");
                            if (th != null) {
                                cause = th.getCause();
                            } else {
                                cause = null;
                            }
                            sbLIZ.append(cause);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    });
                } else {
                    C786410Ut5.LJLLLLLL(0, getBinding().getRoot());
                }
            }
        } else {
            PersonInfo[] personInfoArr = (PersonInfo[]) list.toArray(new PersonInfo[0]);
            l0(h0((PersonInfo[]) Arrays.copyOf(personInfoArr, personInfoArr.length)));
            C1380980m2a viewManager3 = getViewManager();
            C166B binding2 = getBinding();
            viewManager3.getClass();
            binding2.LIZJ().setText(2131826491);
        }
        C1380980m2a viewManager4 = getViewManager();
        TuxTextView tuxTextViewLIZJ = getBinding().LIZJ();
        viewManager4.getClass();
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(tuxTextViewLIZJ.getText()).append((CharSequence) " ");
        Drawable drawableLIZ = C14MI.LIZ(tuxTextViewLIZJ.getContext(), R.drawable.d8x);
        if (drawableLIZ != null) {
            final RotateDrawable rotateDrawable = new RotateDrawable();
            rotateDrawable.setDrawable(drawableLIZ);
            rotateDrawable.setFromDegrees(180.0f);
            rotateDrawable.setToDegrees(180.0f);
            rotateDrawable.setPivotX(0.5f);
            rotateDrawable.setPivotY(0.5f);
            rotateDrawable.setPivotXRelative(true);
            rotateDrawable.setPivotYRelative(true);
            rotateDrawable.setLevel(10000);
            rotateDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            TypedArray typedArrayObtainStyledAttributes = tuxTextViewLIZJ.getContext().obtainStyledAttributes(new int[]{R.attr.a1h});
            int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            C16GF.LJI(rotateDrawable, color);
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            C786410Ut5.q2(spannableStringBuilderAppend, new ImageSpan(rotateDrawable, iLIZIZ) { // from class: X.0GVU
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                    Drawable drawable = getDrawable();
                    if (drawable.getBounds().isEmpty()) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    }
                    int i7 = i6 - i4;
                    int iHeight = drawable.getBounds().height();
                    int iSave = canvas.save();
                    try {
                        int i8 = this.LL;
                        canvas.translate(f, i4 + i8 + (((i7 - i8) - iHeight) / 2));
                        drawable.draw(canvas);
                        canvas.restoreToCount(iSave);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        canvas.restoreToCount(iSave);
                        throw th;
                    }
                }
            }, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 33);
            tuxTextViewLIZJ.setText(spannableStringBuilderAppend);
        }
    }

    public C166A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1369));
        this.LLILLJJLI = new C166U(new AwS275S0000000_31(0));
        this.LLILLL = new C166U(new AwS275S0000000_31(1));
        this.LLJI = true;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1305));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS220S0000000_31(context, 1));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, context, 1370));
        this.LLJILLL = C452501pT.LIZIZ(new AwS220S0000000_31(context, 0));
        this.LLJJ = C452501pT.LIZIZ(new AwS432S0200000_31(this, context, 103));
        C786410Ut5.LJLLLLLL(4, getBinding().getRoot());
    }
}

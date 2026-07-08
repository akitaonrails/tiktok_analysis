package X;

import Y.ARunnableS11S1200000_6;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS97S0200000_28;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21694119vH extends C0SMB {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final EnumC671230QUn LLILZ;
    public final C1910470zob LLILZIL;
    public Aweme LLILZLL;
    public final Function1<String, Unit> LLIZ;
    public final EnumC1781440wSU LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public final C0STF LLJIJIL;
    public PhotoModeImageUrlModel LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public InterfaceC661730PxT LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public String LLJJJIL;
    public UrlModel LLJJJJ;
    public EnumC1338240kve LLJJJJJIL;
    public final C21663419qK LLJJJJLIIL;
    public final C21694219vI LLJJL;

    public final void LJIIZILJ() {
        if (this.LLJJI) {
            return;
        }
        C1910470zob c1910470zob = this.LLILZIL;
        int i = this.LLILLL;
        if (c1910470zob.LIZLLL.containsKey(Integer.valueOf(i))) {
            return;
        }
        c1910470zob.LIZLLL.put(Integer.valueOf(i), Boolean.TRUE);
    }

    public final Pair<Integer, Integer> LJIJ() {
        if (this.LLJJIJIL > 0 && this.LLJJJ > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search_photo_resize_view_size_source=current aid=");
            Aweme aweme = this.LLILZLL;
            sbLIZ.append(aweme != null ? aweme.getAid() : null);
            sbLIZ.append(", pos=");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", size=");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append('x');
            sbLIZ.append(this.LLJJJ);
            C2188811AlT.LIZIZ(sbLIZ);
            return new Pair<>(Integer.valueOf(this.LLJJIJIL), Integer.valueOf(this.LLJJJ));
        }
        C01GW c01gw = C19352610nU.LIZ;
        int i = ((Keva) c01gw.getValue()).getInt("slide_img_width", 0);
        int i2 = ((Keva) c01gw.getValue()).getInt("slide_img_height", 0);
        if (i <= 0 || i2 <= 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("search_photo_resize_view_size_source=none aid=");
            Aweme aweme2 = this.LLILZLL;
            sbLIZ2.append(aweme2 != null ? aweme2.getAid() : null);
            sbLIZ2.append(", pos=");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(", size=0x0");
            C2188811AlT.LIZIZ(sbLIZ2);
            return new Pair<>(0, 0);
        }
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("search_photo_resize_view_size_source=cache aid=");
        Aweme aweme3 = this.LLILZLL;
        sbLIZ3.append(aweme3 != null ? aweme3.getAid() : null);
        sbLIZ3.append(", pos=");
        sbLIZ3.append(this.LLILLL);
        sbLIZ3.append(", size=");
        sbLIZ3.append(pair.getFirst().intValue());
        sbLIZ3.append('x');
        sbLIZ3.append(pair.getSecond().intValue());
        C2188811AlT.LIZIZ(sbLIZ3);
        return pair;
    }

    public final void LJIILL(View view, String str) {
        LifecycleOwner lifecycleOwnerLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        PhotoModeImageUrlModel photoModeImageUrlModel = this.LLJILJIL;
        if (photoModeImageUrlModel == null) {
            return;
        }
        Integer num = photoModeImageUrlModel.darkMainColor;
        if (num == null) {
            Context context = view.getContext();
            if (context != null && (lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0H65(this, photoModeImageUrlModel, str, view, null), 2);
                return;
            }
            return;
        }
        view.setBackgroundColor(num.intValue());
    }

    public final void LJIJJLI(C1331670kl3 c1331670kl3, String str) {
        Aweme aweme;
        if (Intrinsics.LJFF(str, "general_search") && ((Number) C296160BjC.LIZ.getValue()).intValue() >= 1) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "search_cache";
        } else {
            if (!C1335190kqj.LIZIZ() || !C1335190kqj.LIZ().includeGeneralSearch || (aweme = this.LLILZLL) == null || AwemeBizOptExtKt.getAwemeCacheType(aweme) != 1) {
                return;
            }
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "photomode_image_cache_v2";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1338240kve LJIJJ(com.ss.android.ugc.aweme.base.model.UrlModel r10, java.lang.Float r11, kotlin.Pair<java.lang.Integer, java.lang.Integer> r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21694119vH.LJIJJ(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.Float, kotlin.Pair):X.0kve");
    }

    public final UrlModel LJIJI(PhotoModeImageUrlModel photoModeImageUrlModel, boolean z, int i, String str) {
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageUrlModel imagePostCover;
        Aweme aweme2;
        PhotoModeImageInfo photoModeImageInfo2;
        PhotoModeImageUrlModel imagePostCover2;
        MultiImageUrlInfo multiImageUrlInfo;
        List<String> urlList;
        if (!z && C0SNF.LIZIZ) {
            List<MultiImageUrlInfo> list = photoModeImageUrlModel.bitrateImages;
            if (list != null && (multiImageUrlInfo = (MultiImageUrlInfo) C13LP.LJJJLZIJ(0, list)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode Image getTargetImageModel bitrate_image_gear: ");
                sbLIZ.append(multiImageUrlInfo.name);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
                UrlModel urlModel = multiImageUrlInfo.image;
                if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                    this.LLJJIII = true;
                    return urlModel;
                }
            }
            this.LLJJIII = false;
        }
        if (!z) {
            if (C662290PyN.LJ(this.LLILZLL) && Intrinsics.LJFF(str, "general_search") && i == 0 && (aweme2 = this.LLILZLL) != null && (photoModeImageInfo2 = aweme2.getPhotoModeImageInfo()) != null && (imagePostCover2 = photoModeImageInfo2.getImagePostCover()) != null) {
                return imagePostCover2.displayImageNoWatermark;
            }
            if ((C294830Bh3.LIZ() & 1) == 1 && Intrinsics.LJFF(str, "general_search") && i == 0 && (aweme = this.LLILZLL) != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imagePostCover = photoModeImageInfo.getImagePostCover()) != null) {
                if ((C294830Bh3.LIZ() & 2) == 2) {
                    C823050WQl.LJ().schedule(new ARunnableS11S1200000_6(this, photoModeImageUrlModel, str, 3), ((Number) C0ABY.LIZ.getValue()).longValue(), TimeUnit.SECONDS);
                } else if ((C294830Bh3.LIZ() & 4) == 4) {
                    C823050WQl.LJ().schedule(new ARunnableS11S1200000_6(this, photoModeImageUrlModel, str, 4), ((Number) C0ABY.LIZ.getValue()).longValue(), TimeUnit.SECONDS);
                }
                return imagePostCover.displayImageNoWatermark;
            }
        }
        return photoModeImageUrlModel.displayImageNoWatermark;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(final com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r29, int r30, int r31, final com.ss.android.ugc.aweme.feed.model.Aweme r32, final int r33, final java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21694119vH.LJIILLIIL(com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel, int, int, com.ss.android.ugc.aweme.feed.model.Aweme, int, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.19qK] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.19vI] */
    public C21694119vH(View view, final String str, EnumC671230QUn enumC671230QUn, C1910470zob c1910470zob, Aweme aweme, Function1<? super String, Unit> function1, EnumC1781440wSU enumC1781440wSU) {
        super(view);
        this.LLILZ = enumC671230QUn;
        this.LLILZIL = c1910470zob;
        this.LLILZLL = aweme;
        this.LLIZ = function1;
        this.LLIZLLLIL = enumC1781440wSU;
        this.LLJI = -1;
        this.LLJIJIL = (C0STF) view.findViewById(R.id.vmb);
        this.LLJILJILJ = -1;
        this.LLJILLL = -1;
        this.LLJJJIL = "";
        this.LLJJJJJIL = EnumC1338240kve.FIT_CENTER;
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2189571Amh(this, 6));
        if (C1868030yi9.LIZJ() && !this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
            HandlerHook.viewPost(this.LLJIJIL, new ARunnableS129S0100000_29(this, 234));
        }
        this.LLJJJJLIIL = new C0H62() { // from class: X.19qK
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                PhotoModeImageUrlModel photoModeImageUrlModel;
                C21694119vH c21694119vH;
                PhotoModeImageUrlModel photoModeImageUrlModel2;
                if (C0N72.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE && Intrinsics.LJFF(str, "general_search") && (photoModeImageUrlModel = this.LLJILJIL) != null && !photoModeImageUrlModel.isCoverLoadSuccess() && (photoModeImageUrlModel2 = (c21694119vH = this).LLJILJIL) != null) {
                    c21694119vH.LJIILLIIL(photoModeImageUrlModel2, c21694119vH.LLJILJILJ, c21694119vH.LLJILLL, c21694119vH.LLILZLL, -1, str);
                }
            }
        };
        this.LLJJL = new InterfaceC427850Gq7() { // from class: X.19vI
            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode Image is released uri: ");
                sbLIZ.append(uri);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode Intermediate image set uri: ");
                sbLIZ.append(uri);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode Image fetch started uri: ");
                sbLIZ.append(uri);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
                if ((!Intrinsics.LJFF(str, "general_search") || !C1832907Fv.LIZ()) && view2 != null) {
                    view2.setBackgroundColor(0);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode Intermediate image failed uri: ");
                sbLIZ.append(uri);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view2, Throwable th) {
                int iLIZ;
                this.LLJJI = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode image onFailed: ");
                sbLIZ.append(uri);
                sbLIZ.append(", ");
                sbLIZ.append(th);
                C2188811AlT.LIZIZ(sbLIZ);
                C21694119vH c21694119vH = this;
                C1910470zob c1910470zob2 = c21694119vH.LLILZIL;
                int i = c21694119vH.LLILLL;
                boolean z = c21694119vH.LLJJIII;
                if (th != null) {
                    iLIZ = C2177208fy.LIZ(th);
                } else {
                    iLIZ = -1;
                }
                c1910470zob2.getClass();
                if (C0BUF.LIZ()) {
                    if (!c1910470zob2.LIZJ.containsKey(Integer.valueOf(i))) {
                        C1910490zod c1910490zod = new C1910490zod(C0SAO.FAIL.getCode(), i, false, false, z, Integer.valueOf(iLIZ));
                        c1910470zob2.LIZJ.put(Integer.valueOf(i), c1910490zod);
                        C823050WQl.LIZJ().execute(new ARunnableS97S0200000_28(c1910470zob2, c1910490zod, 19));
                    }
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                boolean z;
                int width;
                int height;
                this.LLJJI = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode image onComplete ");
                if (c428600GrK != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(" uri: ");
                sbLIZ.append(uri);
                C2188811AlT.LIZIZ(sbLIZ);
                if (view2 != null) {
                    C21694119vH c21694119vH = this;
                    String str2 = str;
                    Pair<Integer, Integer> pairLJIJ = c21694119vH.LJIJ();
                    int iIntValue = pairLJIJ.getFirst().intValue();
                    int iIntValue2 = pairLJIJ.getSecond().intValue();
                    C21694519vL c21694519vL = C21694519vL.LIZ;
                    boolean zLJFF = Intrinsics.LJFF(str2, "general_search");
                    UrlModel urlModel = c21694119vH.LLJJJJ;
                    if (urlModel != null) {
                        width = urlModel.getWidth();
                    } else {
                        width = 0;
                    }
                    UrlModel urlModel2 = c21694119vH.LLJJJJ;
                    if (urlModel2 != null) {
                        height = urlModel2.getHeight();
                    } else {
                        height = 0;
                    }
                    EnumC1338240kve enumC1338240kve = c21694119vH.LLJJJJJIL;
                    if (!zLJFF) {
                        c21694519vL.getClass();
                    } else {
                        c21694519vL.getClass();
                        C21694619vM c21694619vMLIZ = C21694519vL.LIZ(iIntValue, iIntValue2, width, height, enumC1338240kve);
                        if (C1833007Fw.LIZIZ() && c21694619vMLIZ.LJ && !Intrinsics.LJFF(c21694619vMLIZ.LIZIZ, "none") && c21694619vMLIZ.LIZ >= 0.2f) {
                            c21694119vH.LJIILL(view2, str2);
                        }
                    }
                    EnumC671230QUn enumC671230QUn2 = c21694119vH.LLILZ;
                    if (enumC671230QUn2 == EnumC671230QUn.BLACK) {
                        view2.setBackgroundColor(-16777216);
                    } else if (enumC671230QUn2 == EnumC671230QUn.AUTO) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, c21694119vH.LL.getContext());
                        if (numLIZJ != null) {
                            view2.setBackgroundColor(numLIZJ.intValue());
                        }
                    } else if (enumC671230QUn2 == EnumC671230QUn.MAIN_COLOR_DARK) {
                        c21694119vH.LJIILL(view2, str2);
                    } else {
                        view2.setBackgroundColor(-16777216);
                    }
                }
                C21694119vH c21694119vH2 = this;
                C1910470zob c1910470zob2 = c21694119vH2.LLILZIL;
                int i = c21694119vH2.LLILLL;
                boolean z2 = !c21694119vH2.LLJJ;
                boolean z3 = c21694119vH2.LLJJIII;
                c1910470zob2.getClass();
                if (C0BUF.LIZ()) {
                    if (!c1910470zob2.LIZJ.containsKey(Integer.valueOf(i))) {
                        C1910490zod c1910490zod = new C1910490zod(C0SAO.SUCCESS.getCode(), i, z2, true, z3, null);
                        c1910470zob2.LIZJ.put(Integer.valueOf(i), c1910490zod);
                        C823050WQl.LIZJ().execute(new ARunnableS97S0200000_28(c1910470zob2, c1910490zod, 19));
                    }
                }
            }
        };
    }
}

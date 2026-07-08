package X;

import Y.ACListenerS125S0200000_22;
import Y.ACListenerS156S0100000_22;
import Y.ACListenerS49S0201000_22;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0msb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413230msb extends FrameLayout {
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public String LL;
    public VideoPublishEditModel LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final View LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public RecyclerView LLIZ;
    public C197039127h LLIZLLLIL;
    public C1420170n3n LLJ;
    public List<ImageSelectItem> LLJI;

    public final boolean LIZ() {
        List<ImageSelectItem> list = this.LLJI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<ImageSelectItem> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().isSelected && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r6 = this;
            java.util.List<com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem> r1 = r6.LLJI
            boolean r0 = r1 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L57
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L57
        Ld:
            X.127h r1 = r6.LLIZLLLIL
            if (r1 == 0) goto L1b
            r0 = 2131846755(0x7f116663, float:1.9326968E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            r1.setText(r0)
        L1b:
            boolean r0 = r6.LIZ()
            r3 = 6
            if (r0 != 0) goto L3e
            X.127h r2 = r6.LLIZLLLIL
            if (r2 == 0) goto L3d
            r0 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r0 = r6.LIZIZ(r0)
            r2.setBackgroundColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            X.C1447470nlp.LIZIZ(r2, r0)
        L3d:
            return
        L3e:
            X.127h r2 = r6.LLIZLLLIL
            if (r2 == 0) goto L3d
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = r6.LIZIZ(r0)
            r2.setBackgroundColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            X.C1447470nlp.LIZIZ(r2, r0)
            return
        L57:
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem r0 = (com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem) r0
            boolean r0 = r0.isSelected
            if (r0 == 0) goto L5c
            int r4 = r4 + 1
            if (r4 >= 0) goto L5c
            X.C1697810uHb.LJIJ()
            r0 = 0
            throw r0
        L75:
            if (r4 == 0) goto Ld
            X.127h r3 = r6.LLIZLLLIL
            if (r3 == 0) goto L1b
            android.content.res.Resources r2 = X.C20642515q3.LJFF()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r5] = r0
            r0 = 2131846756(0x7f116664, float:1.932697E38)
            java.lang.String r0 = r2.getString(r0, r1)
            r3.setText(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1413230msb.LIZLLL():void");
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getEditSaveLocal() {
        return this.LLILLL;
    }

    public final String getEntranceType() {
        return this.LL;
    }

    public final int LIZIZ(double d) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (d == 1.0d) {
                return iIntValue;
            }
            return ((((int) (((double) 255) * d)) << 24) | 16777215) & iIntValue;
        }
        return -1;
    }

    public final void LIZJ(Function1<? super Boolean, Unit> function1) {
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS125S0200000_22(this, function1, 10));
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS125S0200000_22(this, function1, 11));
        }
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS125S0200000_22(this, function1, 12));
        }
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLILLJJLI = videoPublishEditModel;
    }

    public final void setEntranceType(String str) {
        this.LL = str;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0mjn] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0n3n] */
    public C1413230msb(Context context, VideoPublishEditModel videoPublishEditModel, String str, Function0 function0) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        RecyclerView recyclerView;
        C197039127h c197039127h;
        ArrayList arrayList;
        List<SingleImageData> imageList;
        LivePhotoPreviewMode livePhotoPreviewMode;
        LivePhotoPreviewMode livePhotoPreviewMode2;
        super(context);
        this.LL = str;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = function0;
        this.LLJI = new ArrayList();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.byg, this, true);
        this.LLILZ = viewTd;
        if (viewTd != null) {
            tuxIconView = (TuxIconView) viewTd.findViewById(R.id.bmy);
        } else {
            tuxIconView = null;
        }
        this.LLILZIL = tuxIconView;
        if (viewTd != null) {
            tuxIconView2 = (TuxIconView) viewTd.findViewById(R.id.e1g);
        } else {
            tuxIconView2 = null;
        }
        this.LLILZLL = tuxIconView2;
        if (viewTd != null) {
            recyclerView = (RecyclerView) viewTd.findViewById(R.id.kfl);
        } else {
            recyclerView = null;
        }
        this.LLIZ = recyclerView;
        if (viewTd != null) {
            c197039127h = (C197039127h) viewTd.findViewById(R.id.u04);
        } else {
            c197039127h = null;
        }
        this.LLIZLLLIL = c197039127h;
        if (this.LLILLJJLI.creativeModel.editSaveLocalModel.selectedImagesList != null && (!r0.isEmpty())) {
            List<ImageSelectItem> list = this.LLILLJJLI.creativeModel.editSaveLocalModel.selectedImagesList;
            this.LLJI = list == null ? new ArrayList<>() : list;
        } else {
            ImageAlbumData imageAlbumData = this.LLILLJJLI.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                for (SingleImageData singleImageData : imageList) {
                    SrcImageInfo srcImageInfoCopy = singleImageData.getSrcImageInfo().copy();
                    List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
                    SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
                    if (srcLiveInfo != null) {
                        livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
                    } else {
                        livePhotoPreviewMode = null;
                    }
                    boolean zLJJJJ = C13LP.LJJJJ(livePhotoPreviewMode, listLJIIJJI);
                    SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
                    if (srcLiveInfo2 != null) {
                        livePhotoPreviewMode2 = srcLiveInfo2.getLivePhotoPreviewMode();
                    } else {
                        livePhotoPreviewMode2 = null;
                    }
                    arrayList2.add(new ImageSelectItem(srcImageInfoCopy, zLJJJJ, livePhotoPreviewMode2, false));
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            this.LLJI = arrayList;
            this.LLILLJJLI.creativeModel.editSaveLocalModel.selectedImagesList = arrayList;
        }
        final List<ImageSelectItem> list2 = this.LLJI;
        final ?? r0 = new InterfaceC1420190n3p() { // from class: X.0mjn
            @Override // X.InterfaceC1420190n3p
            public final void LIZ(int i, boolean z) {
                String str2;
                ((ImageSelectItem) ListProtector.get(this.LIZ.LLJI, i)).isSelected = z;
                this.LIZ.LIZLLL();
                C1413230msb c1413230msb = this.LIZ;
                c1413230msb.getClass();
                if (z) {
                    str2 = "select_photo";
                } else {
                    str2 = "unselect_photo";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("creation_id", c1413230msb.LLILLJJLI.getCreationId());
                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                c2344009Gk.LJIIIIZZ("shoot_way", c1413230msb.LLILLJJLI.mShootWay);
                c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(c1413230msb.LLILLJJLI));
                c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(c1413230msb.LLILLJJLI));
                c2344009Gk.LJIIIIZZ("shoot_tab_name", C1428470nHB.LJJIIZI(c1413230msb.LLILLJJLI));
                c2344009Gk.LIZJ(c1413230msb.LLILLJJLI.creativeModel.commonMobModel.originVideoCount, "video_cnt");
                c2344009Gk.LIZJ(c1413230msb.LLILLJJLI.creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
                c2344009Gk.LJIIIIZZ("entrance_type", c1413230msb.LL);
                c2344009Gk.LIZJ(1, "is_save_format_option");
                c2344009Gk.LIZJ(1, "is_choose_photo_option");
                c2344009Gk.LJIIIIZZ("action_type", str2);
                C20684815ws.LJIILLIIL("save_local_photo_selection", c2344009Gk.LIZ);
            }
        };
        this.LLJ = new AbstractC21673619ry<C1420180n3o>(list2, r0) { // from class: X.0n3n
            public final List<ImageSelectItem> LL;
            public final InterfaceC1420190n3p LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.size();
            }

            {
                this.LL = list2;
                this.LLILLJJLI = r0;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C1331070kk5 hierarchy;
                int i2;
                C1420180n3o c1420180n3o = (C1420180n3o) viewHolder;
                ImageSelectItem imageSelectItem = (ImageSelectItem) ListProtector.get(this.LL, i);
                ViewGroup viewGroup = c1420180n3o.LLILLJJLI;
                if (viewGroup != null) {
                    C1447470nlp.LIZIZ(viewGroup, C418440Gaw.LIZIZ(6));
                }
                SrcImageInfo srcImageInfo = imageSelectItem.imageData;
                if (srcImageInfo.getPath().length() > 0) {
                    if (imageSelectItem.isLivePhotoMode) {
                        TuxIconView tuxIconView3 = c1420180n3o.LLILLL;
                        if (tuxIconView3 != null) {
                            C337180DJs.LIZJ(tuxIconView3);
                        }
                        TuxIconView tuxIconView4 = c1420180n3o.LLILLL;
                        if (tuxIconView4 != null) {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            if (imageSelectItem.livePhotoPreviewMode == LivePhotoPreviewMode.LIVE_PHOTO) {
                                i2 = R.raw.icon_live_photo;
                            } else {
                                i2 = R.raw.icon_live_photo_unlimited;
                            }
                            c419910GdJ.LIZ = i2;
                            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, c1420180n3o.itemView.getContext());
                            tuxIconView4.setTuxIcon(c419910GdJ);
                        }
                    } else {
                        TuxIconView tuxIconView5 = c1420180n3o.LLILLL;
                        if (tuxIconView5 != null) {
                            C337180DJs.LIZ(tuxIconView5);
                        }
                    }
                    C1324750kZt.LJIIIZ(c1420180n3o.LLILZ, Uri.fromFile(new C0VSJ(srcImageInfo.getPath())).toString(), -1, -1);
                    C1322110kVd c1322110kVd = c1420180n3o.LLILZ;
                    if (c1322110kVd != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd, 0);
                    }
                    C1322110kVd c1322110kVd2 = c1420180n3o.LLILZ;
                    if (c1322110kVd2 != null && (hierarchy = c1322110kVd2.getHierarchy()) != null) {
                        hierarchy.LJIIZILJ(InterfaceC1320380kSq.LJI);
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1420180n3o.LLILZ, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(100L);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                } else {
                    C1322110kVd c1322110kVd3 = c1420180n3o.LLILZ;
                    if (c1322110kVd3 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd3, 8);
                    }
                    C1322110kVd c1322110kVd4 = c1420180n3o.LLILZ;
                    if (c1322110kVd4 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd4, 4);
                    }
                    ViewGroup viewGroup2 = c1420180n3o.LLILLJJLI;
                    if (viewGroup2 != null) {
                        viewGroup2.setBackground(C800330VaR.LIZIZ(c1420180n3o.itemView.getContext(), R.drawable.an2));
                    }
                }
                C0HZQ c0hzq = c1420180n3o.LLILZIL;
                if (c0hzq != null) {
                    c0hzq.setChecked(imageSelectItem.isSelected);
                }
                C0HZQ c0hzq2 = c1420180n3o.LLILZIL;
                if (c0hzq2 != null && c0hzq2.isChecked()) {
                    FrameLayout frameLayout = c1420180n3o.LLILZLL;
                    if (frameLayout != null) {
                        frameLayout.setBackgroundColor(0);
                    }
                } else {
                    FrameLayout frameLayout2 = c1420180n3o.LLILZLL;
                    if (frameLayout2 != null) {
                        frameLayout2.setBackground(C800330VaR.LIZIZ(c1420180n3o.itemView.getContext(), R.drawable.c1p));
                    }
                }
                C0HZQ c0hzq3 = c1420180n3o.LLILZIL;
                if (c0hzq3 != null) {
                    C786410Ut5.b9(c0hzq3, new ACListenerS49S0201000_22(c1420180n3o, i, imageSelectItem, 1));
                }
                C1322110kVd c1322110kVd5 = c1420180n3o.LLILZ;
                if (c1322110kVd5 != null) {
                    C786410Ut5.q9(c1322110kVd5, new ACListenerS156S0100000_22(c1420180n3o, 69));
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C1420180n3o c1420180n3o = new C1420180n3o((FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.byf, viewGroup, false), this.LLILLJJLI);
                try {
                    View view = c1420180n3o.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1420180n3o.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1420180n3o.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1420180n3o.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1420180n3o.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1420180n3o.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1420180n3o.class.getName();
                return c1420180n3o;
            }
        };
        RecyclerView recyclerView2 = this.LLIZ;
        if (recyclerView2 != null) {
            View rootView = recyclerView2.getRootView();
            recyclerView2.setLayoutManager(new LinearLayoutManager(rootView != null ? rootView.getContext() : null, 0, false));
            recyclerView2.setAdapter(this.LLJ);
            recyclerView2.addItemDecoration(new C1466550oGb(recyclerView2, this, 1));
        }
        LIZLLL();
    }
}

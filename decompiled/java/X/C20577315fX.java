package X;

import Y.AAListenerS341S0100000_31;
import Y.AObjectS248S0100000_31;
import Y.ARunnableS131S0100000_31;
import Y.AUListenerS278S0100000_31;
import Y.AfS139S0200000_3;
import Y.AfS172S0100000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import irm.AkS97S0100000_31;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15fX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20577315fX extends Scene implements InterfaceC1166920gTK {
    public final MediaModel LLJI;
    public final Effect LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final CreativeInfo LLJJ;
    public ImageView LLJJI;
    public SmartImageView LLJJIII;
    public SmartImageView LLJJIJI;
    public RelativeLayout LLJJIJIIJIL;
    public TextView LLJJJ;
    public View LLJJJIL;
    public TextView LLJJJJ;
    public C20577615fa LLJJJJJIL;
    public C20577615fa LLJJJJLIIL;
    public EditPreviewStickerViewModel LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public int LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public ValueAnimator LLLILZJ;
    public ValueAnimator LLLILZLLLI;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2675));
    public float LLLFF = 1.0f;
    public final C01GW LLLILZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(760));
    public final ArrayList<ArrayList<Coordinate>> LLLIZZ = new ArrayList<>();
    public final C11NJ LLLJ = new C11NJ();

    public final void LLLJ() {
        this.LLLIIL = true;
        C20577615fa c20577615fa = this.LLJJJJJIL;
        if (c20577615fa == null) {
            c20577615fa = null;
        }
        c20577615fa.setCompleteListener(null);
        C20577615fa c20577615fa2 = this.LLJJJJJIL;
        if (c20577615fa2 == null) {
            c20577615fa2 = null;
        }
        c20577615fa2.setShowAnimation(false);
        C20577615fa c20577615fa3 = this.LLJJJJJIL;
        C786410Ut5.h0(c20577615fa3 != null ? c20577615fa3 : null, 4);
        LLLIZZ(false);
        if (this.LLLILZLLLI == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
            this.LLLILZLLLI = duration;
            duration.setRepeatCount(0);
            duration.addUpdateListener(new AUListenerS278S0100000_31(this, 57));
        }
        ValueAnimator valueAnimator = this.LLLILZLLLI;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LLLILZLLLI;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            ValueAnimator valueAnimator3 = this.LLLILZLLLI;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new AAListenerS341S0100000_31(this, 19));
            }
        }
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C0HZQ LLLIIIIL() {
        return (C0HZQ) this.LLJJIJIL.getValue();
    }

    public final h0<Integer> LLLIILIL() {
        return (h0) this.LLLILZ.getValue();
    }

    public final void LLLIL() {
        Integer numLIZJ;
        C522480KeM c522480KeM = C522480KeM.LIZ;
        String str = this.LLJILJIL;
        String str2 = this.LLJILJILJ;
        String str3 = this.LLJILLL;
        String creationId = this.LLJJ.getCreationId();
        c522480KeM.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("content_source", str2);
        c0lab.LJ("content_type", str3);
        c0lab.LJ("creation_id", creationId);
        c0lab.LIZ(C522480KeM.LIZIZ, "video_cnt");
        c0lab.LIZ(C522480KeM.LIZJ, "pic_cnt");
        c0lab.LIZ(C522480KeM.LIZLLL, "is_multi_content");
        c0lab.LIZ(C522480KeM.LJ, "creation_duration");
        c0lab.LIZ(C522480KeM.LJFF ? 1 : 0, "is_editor_pro");
        c0lab.LIZ(C522480KeM.LJI ? 1 : 0, "is_from_create_template");
        C20684815ws.LJIILLIIL("click_remove_background", c0lab.LIZ);
        if (this.LLL || isLoading() || this.LLLIIL) {
            return;
        }
        C786410Ut5.y5(LLLIIIIL(), 1.0f);
        TextView textView = this.LLJJJ;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.S4(1.0f, textView);
        Integer numLIZJ2 = LLLIILIL().LIZJ();
        if ((numLIZJ2 != null && numLIZJ2.intValue() == 3) || ((numLIZJ = LLLIILIL().LIZJ()) != null && numLIZJ.intValue() == 0)) {
            if (isLoading()) {
                return;
            }
            this.LLLIILIL = false;
            LLLIILIL().LJII(1);
            C786410Ut5.y5(LLLIIIIL(), 0.4f);
            TextView textView2 = this.LLJJJ;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.S4(0.4f, textView2);
            TextView textView3 = this.LLJJJJ;
            if (textView3 == null) {
                textView3 = null;
            }
            C786410Ut5.S4(0.4f, textView3);
            TextView textView4 = this.LLJJJJ;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setEnabled(false);
            TextView textView5 = this.LLJJJ;
            (textView5 != null ? textView5 : null).setText(2131829862);
            if (this.LLLILZJ == null) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                this.LLLILZJ = duration;
                duration.setRepeatCount(0);
                duration.addUpdateListener(new AUListenerS278S0100000_31(this, 58));
            }
            ValueAnimator valueAnimator = this.LLLILZJ;
            if (valueAnimator != null) {
                valueAnimator.start();
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: X.09oA
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C20577315fX c20577315fX = this.LL;
                        if (!c20577315fX.LLLIILIL) {
                            c20577315fX.LLLIL = false;
                            C20577615fa c20577615fa = c20577315fX.LLJJJJJIL;
                            final EditPreviewStickerViewModel editPreviewStickerViewModel = null;
                            if (c20577615fa == null) {
                                c20577615fa = null;
                            }
                            c20577615fa.setPoints(c20577315fX.LLLIZZ);
                            C20577615fa c20577615fa2 = this.LL.LLJJJJJIL;
                            if (c20577615fa2 == null) {
                                c20577615fa2 = null;
                            }
                            c20577615fa2.setShowAnimation(true);
                            C20577615fa c20577615fa3 = this.LL.LLJJJJJIL;
                            if (c20577615fa3 == null) {
                                c20577615fa3 = null;
                            }
                            C786410Ut5.h0(c20577615fa3, 0);
                            C20577315fX c20577315fX2 = this.LL;
                            EditPreviewStickerViewModel editPreviewStickerViewModel2 = c20577315fX2.LLJJL;
                            if (editPreviewStickerViewModel2 != null) {
                                editPreviewStickerViewModel = editPreviewStickerViewModel2;
                            }
                            final CreativeInfo creativeInfo = c20577315fX2.LLJJ;
                            final String strLJFF = c20577315fX2.LLJI.LJFF();
                            Effect effect = this.LL.LLJIJIL;
                            editPreviewStickerViewModel.getClass();
                            if (C2286708xd.LIZJ(strLJFF)) {
                                editPreviewStickerViewModel.LLILZIL = new C11NJ();
                                final int[] iArr = {1280, 720};
                                if (effect != null) {
                                    CustomStickerExtra customStickerExtra = (CustomStickerExtra) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), effect.getExtra(), CustomStickerExtra.class);
                                    if (customStickerExtra.getUploadHeightLimit() > 0) {
                                        iArr[0] = customStickerExtra.getUploadHeightLimit();
                                    }
                                    if (customStickerExtra.getUploadWidthLimit() > 0) {
                                        iArr[1] = customStickerExtra.getUploadWidthLimit();
                                    }
                                }
                                C11NJ c11nj = editPreviewStickerViewModel.LLILZIL;
                                if (c11nj != null && c11nj.LLILLJJLI) {
                                    return;
                                }
                                InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.09Y9
                                    @Override // X.InterfaceC1478005qU
                                    public final void subscribe(C09AJ<File> c09aj) throws Throwable {
                                        C1C7U.LIZ("EditPreviewStickerViewModel@875e.compressImage$observable$1");
                                        Bitmap bitmapLIZ = C2475009mu.LIZ(strLJFF, iArr);
                                        EditPreviewStickerViewModel editPreviewStickerViewModel3 = editPreviewStickerViewModel;
                                        int width = bitmapLIZ.getWidth();
                                        int height = bitmapLIZ.getHeight();
                                        editPreviewStickerViewModel3.getClass();
                                        editPreviewStickerViewModel3.setState(new C20578615fk(width, height));
                                        C0VSJ c0vsjLIZLLL = C2279508wT.LIZLLL(creativeInfo, bitmapLIZ, Bitmap.CompressFormat.JPEG);
                                        if (c0vsjLIZLLL != null) {
                                            c09aj.onNext(c0vsjLIZLLL);
                                        } else {
                                            c09aj.tryOnError(new IllegalStateException("Compress Error"));
                                        }
                                        C1C7U.LIZIZ("EditPreviewStickerViewModel@875e.compressImage$observable$1");
                                    }
                                }).LJL(C11S5.LIZ()).LJJLL(new AfS139S0200000_3((Object) editPreviewStickerViewModel, (Context) creativeInfo, (Function1<? super Drawable, Unit>) 6), new AfS172S0100000_3(editPreviewStickerViewModel, 54));
                                C11NJ c11nj2 = editPreviewStickerViewModel.LLILZIL;
                                if (c11nj2 == null) {
                                    return;
                                }
                                c11nj2.LIZ(interfaceC420801kMLJJLL);
                            }
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        ValueAnimator valueAnimator2 = this.LL.LLLILZJ;
                        if (valueAnimator2 != null) {
                            valueAnimator2.removeAllListeners();
                        }
                    }
                });
                return;
            }
            return;
        }
        if (LLLILZ()) {
            boolean z = !this.LLLIIII;
            this.LLLIIII = z;
            if (z) {
                LLLIIIIL().setChecked(true);
                TextView textView6 = this.LLJJJ;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setText(2131829863);
                SmartImageView smartImageView = this.LLJJIJI;
                if (smartImageView == null) {
                    smartImageView = null;
                }
                SmartImageView smartImageView2 = this.LLJJIII;
                SmartImageView smartImageView3 = smartImageView2 != null ? smartImageView2 : null;
                C786410Ut5.LLFF(0, smartImageView);
                C786410Ut5.LLFF(4, smartImageView3);
                return;
            }
            LLLIIIIL().setChecked(false);
            TextView textView7 = this.LLJJJ;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setText(2131829863);
            SmartImageView smartImageView4 = this.LLJJIII;
            if (smartImageView4 == null) {
                smartImageView4 = null;
            }
            SmartImageView smartImageView5 = this.LLJJIJI;
            SmartImageView smartImageView6 = smartImageView5 != null ? smartImageView5 : null;
            C786410Ut5.LLFF(0, smartImageView4);
            C786410Ut5.LLFF(4, smartImageView6);
        }
    }

    public final boolean LLLILZ() {
        Integer numLIZJ = LLLIILIL().LIZJ();
        return numLIZJ != null && numLIZJ.intValue() == 2;
    }

    public final boolean isLoading() {
        Integer numLIZJ = LLLIILIL().LIZJ();
        return numLIZJ != null && numLIZJ.intValue() == 1;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLJ.dispose();
    }

    public final void LLLII(boolean z) {
        this.LLLIIII = false;
        if (z) {
            LLLJ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPreviewStickerScene#cancelCutout : ");
        C20577615fa c20577615fa = this.LLJJJJJIL;
        C20577615fa c20577615fa2 = null;
        if (c20577615fa == null) {
            c20577615fa = null;
        }
        sbLIZ.append(c20577615fa.LIZ());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C20577615fa c20577615fa3 = this.LLJJJJJIL;
        if (c20577615fa3 == null) {
            c20577615fa3 = null;
        }
        if (c20577615fa3.LIZ()) {
            C20577615fa c20577615fa4 = this.LLJJJJJIL;
            if (c20577615fa4 != null) {
                c20577615fa2 = c20577615fa4;
            }
            c20577615fa2.setCompleteListener(new InterfaceC20578315fh() { // from class: X.15fc
                @Override // X.InterfaceC20578315fh
                public final void onComplete() {
                    C20577315fX c20577315fX = this.LIZ;
                    if (c20577315fX.LLLIL) {
                        return;
                    }
                    c20577315fX.LLLIL = true;
                    c20577315fX.LLLJ();
                }
            });
            return;
        }
        LLLJ();
    }

    public final void LLLILZLLLI(String str) {
        Activity activity;
        C1637890six.LJ("custom_sticker_imageclip_rate", 1, null);
        if (str != null && (activity = this.mActivity) != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(str);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 2050, creativeToastBuilder);
        }
        LLLII(false);
    }

    public final void LLLIZZ(boolean z) {
        C786410Ut5.y5(LLLIIIIL(), 1.0f);
        LLLIIIIL().setChecked(z);
        TextView textView = this.LLJJJ;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.S4(1.0f, textView);
        TextView textView3 = this.LLJJJ;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(2131829863);
        TextView textView4 = this.LLJJJJ;
        if (textView4 == null) {
            textView4 = null;
        }
        C786410Ut5.S4(1.0f, textView4);
        TextView textView5 = this.LLJJJJ;
        if (textView5 != null) {
            textView2 = textView5;
        }
        textView2.setEnabled(true);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJI = (ImageView) view.findViewById(R.id.bmy);
        this.LLJJIII = (SmartImageView) view.findViewById(R.id.grn);
        this.LLJJIJI = (SmartImageView) view.findViewById(R.id.f714gro);
        this.LLJJIJIIJIL = (RelativeLayout) view.findViewById(R.id.o17);
        LLLIIIIL();
        this.LLJJJ = (TextView) view.findViewById(R.id.zh4);
        this.LLJJJIL = view.findViewById(R.id.e0z);
        TextView textView = (TextView) view.findViewById(R.id.cr6);
        this.LLJJJJ = textView;
        EditPreviewStickerViewModel editPreviewStickerViewModel = null;
        if (textView == null) {
            textView = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        TextView textView2 = this.LLJJJJ;
        if (textView2 == null) {
            textView2 = null;
        }
        textView.setBackground(c384050F3z.LIZ(textView2.getContext()));
        C20577615fa c20577615fa = (C20577615fa) view.findViewById(R.id.b4b);
        this.LLJJJJJIL = c20577615fa;
        if (c20577615fa == null) {
            c20577615fa = null;
        }
        c20577615fa.setRepeatCount(-1);
        C20577615fa c20577615fa2 = (C20577615fa) view.findViewById(R.id.o10);
        this.LLJJJJLIIL = c20577615fa2;
        if (c20577615fa2 == null) {
            c20577615fa2 = null;
        }
        c20577615fa2.setDynamicLength(true);
        C20577615fa c20577615fa3 = this.LLJJJJLIIL;
        if (c20577615fa3 == null) {
            c20577615fa3 = null;
        }
        c20577615fa3.setRatio(0.8f);
        TextView textView3 = this.LLJJJJ;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.T7(textView3, new AkS80S0100000_8(this, 38));
        C786410Ut5.b9(LLLIIIIL(), new AkS97S0100000_31(this, 16));
        TextView textView4 = this.LLJJJ;
        if (textView4 == null) {
            textView4 = null;
        }
        C786410Ut5.T7(textView4, new AkS97S0100000_31(this, 17));
        View view2 = this.LLJJJIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new AkS97S0100000_31(this, 18), view2);
        ImageView imageView = this.LLJJI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new AkS80S0100000_8(this, 39));
        LLLIILIL().LIZ(this, new AObjectS248S0100000_31(this, 14));
        this.LLLJ.LIZ(C11NZ.LJIJJLI(new C2502409rK(this, 6)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.00OF
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("EditPreviewStickerScene@344a.showImage$observable$2");
                C1C7U.LIZIZ("EditPreviewStickerScene@344a.showImage$observable$2");
            }
        }, new C09JN() { // from class: X.00OG
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("EditPreviewStickerScene@344a.showImage$observable$3");
                C1C7U.LIZIZ("EditPreviewStickerScene@344a.showImage$observable$3");
            }
        }, new C16HS(this, 5)));
        EditPreviewStickerViewModel editPreviewStickerViewModel2 = (EditPreviewStickerViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(EditPreviewStickerViewModel.class);
        this.LLJJL = editPreviewStickerViewModel2;
        if (editPreviewStickerViewModel2 == null) {
            editPreviewStickerViewModel2 = null;
        }
        C11EA.LJII(this, editPreviewStickerViewModel2, new C2217381BqS() { // from class: X.15fd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditPreviewStickerState) obj).getCutoutData();
            }
        }, new AwS645S0100000_31(this, 109));
        EditPreviewStickerViewModel editPreviewStickerViewModel3 = this.LLJJL;
        if (editPreviewStickerViewModel3 == null) {
            editPreviewStickerViewModel3 = null;
        }
        subscribeEvent(editPreviewStickerViewModel3, new C2217381BqS() { // from class: X.15fg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditPreviewStickerState) obj).getCompressBitmapEvent();
            }
        }, new C1765020w20(), new AwS645S0100000_31(this, 110));
        EditPreviewStickerViewModel editPreviewStickerViewModel4 = this.LLJJL;
        if (editPreviewStickerViewModel4 == null) {
            editPreviewStickerViewModel4 = null;
        }
        C11EA.LJII(this, editPreviewStickerViewModel4, new C2217381BqS() { // from class: X.15fe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditPreviewStickerState) obj).getCutoutError();
            }
        }, new AwS645S0100000_31(this, 111));
        EditPreviewStickerViewModel editPreviewStickerViewModel5 = this.LLJJL;
        if (editPreviewStickerViewModel5 != null) {
            editPreviewStickerViewModel = editPreviewStickerViewModel5;
        }
        C11EA.LJII(this, editPreviewStickerViewModel, new C2217381BqS() { // from class: X.15ff
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditPreviewStickerState) obj).getCancel();
            }
        }, new AwS645S0100000_31(this, 112));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public final void LLLJL(File file, final List list, Location location) {
        C20577615fa c20577615fa = this.LLJJJJJIL;
        SmartImageView smartImageView = null;
        if (c20577615fa == null) {
            c20577615fa = null;
        }
        c20577615fa.setCompleteListener(null);
        this.LLJZIJLIL = file.getAbsolutePath();
        float f = this.LLLFF;
        Location location2 = new Location((int) (location.left / f), (int) (location.top / f), (int) (location.width / f), (int) (location.height / f));
        this.LLLI += location2.left;
        this.LLLII += location2.top;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(location2.width, location2.height);
        layoutParams.addRule(9);
        layoutParams.setMargins(this.LLLI, this.LLLII, 0, 0);
        SmartImageView smartImageView2 = this.LLJJIJI;
        if (smartImageView2 == null) {
            smartImageView2 = null;
        }
        C786410Ut5.G6(smartImageView2, layoutParams);
        SmartImageView smartImageView3 = this.LLJJIJI;
        if (smartImageView3 == null) {
            smartImageView3 = null;
        }
        C786410Ut5.u5(smartImageView3, 0.0f);
        SmartImageView smartImageView4 = this.LLJJIJI;
        if (smartImageView4 == null) {
            smartImageView4 = null;
        }
        C786410Ut5.LLFF(0, smartImageView4);
        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
        c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
        SmartImageView smartImageView5 = this.LLJJIJI;
        if (smartImageView5 != null) {
            smartImageView = smartImageView5;
        }
        c1331670kl3LJII.LJJ(smartImageView);
        c1331670kl3LJII.LJIIJ(new InterfaceC427850Gq7() { // from class: X.15fZ
            public boolean LL;

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                if (this.LL) {
                    return;
                }
                this.LL = true;
                C20577315fX c20577315fX = this.LLILLJJLI;
                List<List<Coordinate>> list2 = list;
                if (c428600GrK != null) {
                    c20577315fX.getClass();
                    c20577315fX.LLJLLIL = c428600GrK.LIZ;
                    c20577315fX.LLJLLL = c428600GrK.LIZIZ;
                }
                RelativeLayout relativeLayout = c20577315fX.LLJJIJIIJIL;
                C20577615fa c20577615fa2 = null;
                if (relativeLayout == null) {
                    relativeLayout = null;
                }
                C786410Ut5.Sb(relativeLayout, 0.75f);
                RelativeLayout relativeLayout2 = c20577315fX.LLJJIJIIJIL;
                if (relativeLayout2 == null) {
                    relativeLayout2 = null;
                }
                C786410Ut5.tc(relativeLayout2, 0.75f);
                C20577615fa c20577615fa3 = c20577315fX.LLJJJJJIL;
                if (c20577615fa3 == null) {
                    c20577615fa3 = null;
                }
                c20577615fa3.setShowAnimation(false);
                C20577615fa c20577615fa4 = c20577315fX.LLJJJJJIL;
                if (c20577615fa4 == null) {
                    c20577615fa4 = null;
                }
                C786410Ut5.h0(c20577615fa4, 4);
                C20577615fa c20577615fa5 = c20577315fX.LLJJJJLIIL;
                if (c20577615fa5 == null) {
                    c20577615fa5 = null;
                }
                float f2 = c20577315fX.LLLFFI;
                float f3 = c20577315fX.LLLFZ;
                float f4 = c20577315fX.LLLFF;
                Iterator<List<Coordinate>> it2 = list2.iterator();
                while (it2.hasNext()) {
                    for (Coordinate coordinate : it2.next()) {
                        coordinate.setX((coordinate.x / f4) + f2);
                        coordinate.setY((coordinate.y / f4) + f3);
                    }
                }
                c20577615fa5.setPoints(list2);
                C20577615fa c20577615fa6 = c20577315fX.LLJJJJLIIL;
                if (c20577615fa6 == null) {
                    c20577615fa6 = null;
                }
                c20577615fa6.setShowAnimation(true);
                C20577615fa c20577615fa7 = c20577315fX.LLJJJJLIIL;
                if (c20577615fa7 != null) {
                    c20577615fa2 = c20577615fa7;
                }
                HandlerHook.viewPostDelay(c20577615fa2, new ARunnableS131S0100000_31(c20577315fX, 167), 1200L);
            }
        });
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.eop, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public C20577315fX(MediaModel mediaModel, Effect effect, String str, String str2, String str3, CreativeInfo creativeInfo) {
        this.LLJI = mediaModel;
        this.LLJIJIL = effect;
        this.LLJILJIL = str;
        this.LLJILJILJ = str2;
        this.LLJILLL = str3;
        this.LLJJ = creativeInfo;
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}

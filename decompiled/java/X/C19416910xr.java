package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import irm.AkS66S0200000_29;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416910xr extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<Pair<ReadTextEffectBean, C2376409Sw>> LL = new ArrayList();
    public InterfaceC19417310xv LLILLJJLI;

    public final void LLLII() {
        for (Pair<ReadTextEffectBean, C2376409Sw> pair : this.LL) {
            C2376409Sw second = pair.getSecond();
            if (second != null) {
                second.LIZ = 0;
            }
            C2376409Sw second2 = pair.getSecond();
            if (second2 != null) {
                second2.LIZIZ = false;
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final void LLLI(int i) {
        int i2 = 0;
        for (Object obj : (ArrayList) this.LL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Pair pair = (Pair) obj;
                if (i == i2) {
                    C2376409Sw c2376409Sw = (C2376409Sw) pair.getSecond();
                    if (c2376409Sw != null) {
                        c2376409Sw.LIZIZ = true;
                    }
                } else {
                    C2376409Sw c2376409Sw2 = (C2376409Sw) pair.getSecond();
                    if (c2376409Sw2 != null) {
                        c2376409Sw2.LIZIZ = false;
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        notifyDataSetChanged();
    }

    public final void LLLIIIIL(ArrayList<ReadTextEffectBean> arrayList) {
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).add(new Pair(null, new C2376409Sw()));
        for (ReadTextEffectBean readTextEffectBean : arrayList) {
            ((ArrayList) this.LL).add(new Pair(readTextEffectBean, new C2376409Sw()));
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object first;
        Pair pair = (Pair) C13LP.LJJJLZIJ(i, this.LL);
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        if (first instanceof VoiceCloneReadTextEffectBean) {
            return EnumC047100Ez.AI_VOICE.getValue();
        }
        return EnumC047100Ez.NORMAL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

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
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        List<String> urlList;
        Resources resources;
        String string;
        Pair pair = (Pair) C13LP.LJJJLZIJ(i, this.LL);
        if (pair == null) {
            return;
        }
        boolean z2 = true;
        int i3 = 14;
        if (viewHolder instanceof C19417210xu) {
            C19417210xu c19417210xu = (C19417210xu) viewHolder;
            c19417210xu.LL.setPosition(i);
            C19417010xs c19417010xs = c19417210xu.LL;
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) pair.getFirst();
            c19417010xs.LLJJI = readTextEffectBean;
            if (c19417010xs.LLJIJIL == 0) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC19417310xv interfaceC19417310xv = null;
            String string2 = null;
            drawable = null;
            Drawable drawable = null;
            if (z) {
                if (C357780E0y.LIZ()) {
                    FrameLayout frameLayout = c19417010xs.LLIZLLLIL;
                    if (frameLayout != null) {
                        C337180DJs.LIZJ(frameLayout);
                    }
                    SmartImageView smartImageView = c19417010xs.LLILZIL;
                    if (smartImageView != null) {
                        C337180DJs.LIZ(smartImageView);
                    }
                    TuxTextView tuxTextView = c19417010xs.LLIZ;
                    if (tuxTextView != null) {
                        Context context = c19417010xs.getContext();
                        if (context != null) {
                            string2 = context.getString(R.string.m8s);
                        }
                        tuxTextView.setText(string2);
                    }
                } else {
                    C19470511Fn c19470511Fn = c19417010xs.LLILLL;
                    if (c19470511Fn != null) {
                        Context context2 = c19470511Fn.getContext();
                        if (context2 != null) {
                            string = context2.getString(R.string.m8s);
                        } else {
                            string = null;
                        }
                        c19470511Fn.setText(string);
                    }
                    C19470511Fn c19470511Fn2 = c19417010xs.LLILLL;
                    if (c19470511Fn2 != null) {
                        c19470511Fn2.setIconImagePadding(10);
                    }
                    C19470511Fn c19470511Fn3 = c19417010xs.LLILLL;
                    if (c19470511Fn3 != null) {
                        Context context3 = c19470511Fn3.getContext();
                        if (context3 != null && (resources = context3.getResources()) != null) {
                            drawable = resources.getDrawable(R.drawable.c49);
                        }
                        c19470511Fn3.LIZIZ(drawable);
                    }
                    C19470511Fn c19470511Fn4 = c19417010xs.LLILLL;
                    if (c19470511Fn4 != null) {
                        c19470511Fn4.setRoundRadius(14);
                    }
                }
                ImageView imageView = c19417010xs.LLILLJJLI;
                if (imageView != null) {
                    C786410Ut5.LJZI(8, imageView);
                }
                c19417010xs.setSelectedView(false);
            } else if (readTextEffectBean != null && readTextEffectBean.effect != null) {
                SmartImageView smartImageView2 = c19417010xs.LLILZIL;
                if (smartImageView2 != null) {
                    C337180DJs.LIZJ(smartImageView2);
                }
                FrameLayout frameLayout2 = c19417010xs.LLIZLLLIL;
                if (frameLayout2 != null) {
                    C337180DJs.LIZ(frameLayout2);
                }
                C19470511Fn c19470511Fn5 = c19417010xs.LLILLL;
                if (c19470511Fn5 != null) {
                    c19470511Fn5.setIconImagePadding(0);
                }
                C19470511Fn c19470511Fn6 = c19417010xs.LLILLL;
                if (c19470511Fn6 != null) {
                    c19470511Fn6.setText(readTextEffectBean.effect.getName());
                }
                TuxTextView tuxTextView2 = c19417010xs.LLIZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(readTextEffectBean.effect.getName());
                }
                if (readTextEffectBean.mSpeaker.isFake) {
                    C19470511Fn c19470511Fn7 = c19417010xs.LLILLL;
                    if (c19470511Fn7 != null) {
                        C19470411Fm imageView2 = c19470511Fn7.getImageView();
                        if (imageView2.LL) {
                            SmartImageView smartImageView3 = imageView2.LLILZ;
                            if (smartImageView3 == null) {
                                smartImageView3 = null;
                            }
                            C1324750kZt.LIZIZ(smartImageView3, R.drawable.c8q);
                        } else {
                            C1324800kZy c1324800kZy = imageView2.LLILLL;
                            if (c1324800kZy == null) {
                                c1324800kZy = null;
                            }
                            C1324750kZt.LIZIZ(c1324800kZy, R.drawable.c8q);
                        }
                    }
                } else {
                    UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
                    if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        C19470511Fn c19470511Fn8 = c19417010xs.LLILLL;
                        if (c19470511Fn8 != null) {
                            c19470511Fn8.LJ((String) ListProtector.get(urlList, 0));
                        }
                        if (((Boolean) c19417010xs.LLJJ.getValue()).booleanValue()) {
                            if (!((Boolean) c19417010xs.LLJJ.getValue()).booleanValue()) {
                                i3 = 8;
                            }
                            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                            SmartImageView smartImageView4 = c19417010xs.LLILZIL;
                            if (smartImageView4 != null) {
                                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ((String) ListProtector.get(urlList, 0));
                                C1331750klB c1331750klB = new C1331750klB();
                                c1331750klB.LJI = new C1331920klS(fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
                                c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
                                c1331670kl3LJIIIZ.LJJ(smartImageView4);
                                C786410Ut5.h3(c1331670kl3LJIIIZ);
                            }
                        }
                    }
                }
                c19417010xs.setSelectedView(false);
                InterfaceC19417310xv interfaceC19417310xv2 = c19417010xs.LLJILJIL;
                if (interfaceC19417310xv2 != null) {
                    interfaceC19417310xv = interfaceC19417310xv2;
                }
                if (interfaceC19417310xv.LLJLILLLLZIIL(readTextEffectBean.mSpeaker.speakreID)) {
                    c19417010xs.LIZIZ(1, false);
                } else {
                    c19417010xs.LIZIZ(0, false);
                }
            }
            c19417210xu.LL.setSelectedView(false);
            C2376409Sw c2376409Sw = (C2376409Sw) pair.getSecond();
            if (c2376409Sw != null) {
                c19417210xu.LL.setSelectedView(c2376409Sw.LIZIZ);
                c19417210xu.LL.LIZIZ(c2376409Sw.LIZ, c2376409Sw.LIZIZ);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C19417110xt)) {
            return;
        }
        C19417110xt c19417110xt = (C19417110xt) viewHolder;
        c19417110xt.LLJIJIL = i;
        ReadTextEffectBean readTextEffectBean2 = (ReadTextEffectBean) pair.getFirst();
        if (!(readTextEffectBean2 instanceof VoiceCloneReadTextEffectBean)) {
            return;
        }
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = (VoiceCloneReadTextEffectBean) readTextEffectBean2;
        c19417110xt.LLJILJIL = voiceCloneReadTextEffectBean;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel = voiceCloneReadTextEffectBean.userAvatar;
        if (urlModel != null) {
            if (c19417110xt.L5()) {
                if (c19417110xt.L5()) {
                    i2 = 14;
                } else {
                    i2 = 8;
                }
                float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
                C1331750klB c1331750klB2 = new C1331750klB();
                c1331750klB2.LJI = new C1331920klS(fLIZIZ2, fLIZIZ2, fLIZIZ2, fLIZIZ2);
                c1331670kl3LJIIJ.LJJI = new C1331730kl9(c1331750klB2);
                c1331670kl3LJIIJ.LJJ(c19417110xt.LLILLJJLI);
                C786410Ut5.h3(c1331670kl3LJIIJ);
            } else {
                C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
                c1331670kl3LJIIJ2.LJJ(c19417110xt.LLILLJJLI);
                C786410Ut5.h3(c1331670kl3LJIIJ2);
            }
        }
        c19417110xt.LLILLL.setText(c19417110xt.LL.getResources().getString(2131820776));
        if (voiceCloneReadTextEffectBean.isPrivate) {
            String string3 = c19417110xt.LLILLL.getText().toString();
            TuxTextView tuxTextView3 = c19417110xt.LLILLL;
            c19417110xt.LL.getContext();
            tuxTextView3.setText(new SpannableString(string3));
        }
        if (voiceCloneReadTextEffectBean.isRecordCompleted) {
            C786410Ut5.LJLLLLLL(8, c19417110xt.LLIZLLLIL);
        } else {
            C786410Ut5.LJLLLLLL(0, c19417110xt.LLIZLLLIL);
            C11VK c11vk = C11VK.LIZ;
            InterfaceC19417310xv interfaceC19417310xv3 = c19417110xt.LLJILJILJ;
            if (interfaceC19417310xv3 == null || !interfaceC19417310xv3.IJ()) {
                z2 = false;
            }
            c11vk.getClass();
            C11VK.LJ("editor_pro_tts", "show", z2);
        }
        C2376409Sw c2376409Sw2 = (C2376409Sw) pair.getSecond();
        if (c2376409Sw2 != null) {
            c19417110xt.N5(c2376409Sw2.LIZIZ);
            c19417110xt.I5(c2376409Sw2.LIZ, c2376409Sw2.LIZIZ);
        }
        if (!c19417110xt.L5()) {
            return;
        }
        View view = c19417110xt.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C786410Ut5.LJLLLLLL(8, c19417110xt.LLILZIL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        RecyclerView.ViewHolder c19417210xu;
        int i3;
        int iIntValue = -7829368;
        if (i == EnumC047100Ez.AI_VOICE.getValue()) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
            if (C357780E0y.LIZ()) {
                i3 = R.layout.u2;
            } else {
                i3 = R.layout.u1;
            }
            C19417110xt c19417110xt = new C19417110xt(C786410Ut5.Td(layoutInflaterNe, i3, viewGroup, false));
            InterfaceC19417310xv interfaceC19417310xv = this.LLILLJJLI;
            c19417210xu = c19417110xt;
            if (interfaceC19417310xv != null) {
                c19417110xt.LLJILJILJ = interfaceC19417310xv;
                C786410Ut5.I7(new AkS66S0200000_29(c19417110xt, interfaceC19417310xv, 8), c19417110xt.LL);
                C19670811xi c19670811xi = c19417110xt.LLILZ;
                c19670811xi.setCircleRadius(c19670811xi.getLayoutParams().width / 2);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, c19670811xi.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                c19670811xi.setProgressColor(iIntValue);
                c19670811xi.setUseCenterIfNeed(true);
                c19670811xi.setMaxProgress(100);
                C786410Ut5.G1(c19670811xi, 8);
                c19417210xu = c19417110xt;
            }
        } else {
            C19417010xs c19417010xs = new C19417010xs(viewGroup.getContext());
            InterfaceC19417310xv interfaceC19417310xv2 = this.LLILLJJLI;
            if (interfaceC19417310xv2 != null) {
                LayoutInflater layoutInflaterNe2 = C786410Ut5.ne(viewGroup.getContext());
                c19417010xs.LLJILJIL = interfaceC19417310xv2;
                if (C357780E0y.LIZ()) {
                    i2 = R.layout.ub;
                } else {
                    i2 = R.layout.ua;
                }
                View viewTd = C786410Ut5.Td(layoutInflaterNe2, i2, viewGroup, false);
                c19417010xs.LLILLJJLI = (ImageView) viewTd.findViewById(R.id.l9e);
                c19417010xs.LLJ = (C1295960jpS) viewTd.findViewById(R.id.ns2);
                c19417010xs.LLILZ = viewTd.findViewById(R.id.ii1);
                c19417010xs.LLILZIL = (SmartImageView) viewTd.findViewById(R.id.kfa);
                c19417010xs.LLILZLL = (CardView) viewTd.findViewById(R.id.c9c);
                c19417010xs.LLIZ = (TuxTextView) viewTd.findViewById(R.id.xrk);
                c19417010xs.LLIZLLLIL = (FrameLayout) viewTd.findViewById(R.id.pb6);
                C1295960jpS c1295960jpS = c19417010xs.LLJ;
                if (c1295960jpS != null) {
                    c1295960jpS.setAnimation("creation_audio_wave_anim_tux_lottie.json");
                    c1295960jpS.setRepeatCount(-1);
                    c1295960jpS.playAnimation();
                }
                C19670811xi c19670811xi2 = (C19670811xi) viewTd.findViewById(R.id.lnr);
                c19417010xs.LLJILJILJ = c19670811xi2;
                if (c19670811xi2 != null) {
                    c19670811xi2.setCircleRadius(c19670811xi2.getLayoutParams().width / 2);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e4, c19670811xi2.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    }
                    c19670811xi2.setProgressColor(iIntValue);
                    c19670811xi2.setUseCenterIfNeed(true);
                    c19670811xi2.setMaxProgress(100);
                    C786410Ut5.G1(c19670811xi2, 8);
                }
                C19470511Fn c19470511Fn = (C19470511Fn) viewTd.findViewById(R.id.khk);
                if (c19470511Fn != null) {
                    c19470511Fn.setClickStatusColor(C1388580mEq.LIZ(R.attr.ee, c19470511Fn.getContext()));
                } else {
                    c19470511Fn = null;
                }
                c19417010xs.LLILLL = c19470511Fn;
                C786410Ut5.I7(new AkS66S0200000_29(c19417010xs, interfaceC19417310xv2, 7), viewTd);
                c19417010xs.addView(viewTd);
            }
            c19417210xu = new C19417210xu(c19417010xs);
        }
        try {
            View view = c19417210xu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19417210xu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19417210xu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19417210xu.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19417210xu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19417210xu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19417210xu.getClass().getName();
        return c19417210xu;
    }

    public final void LLLFZ(int i, int i2, boolean z) {
        int i3 = 0;
        for (Pair<ReadTextEffectBean, C2376409Sw> pair : this.LL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                Pair<ReadTextEffectBean, C2376409Sw> pair2 = pair;
                if (i == i3) {
                    C2376409Sw second = pair2.getSecond();
                    if (second != null) {
                        second.LIZ = i2;
                    }
                    C2376409Sw second2 = pair2.getSecond();
                    if (second2 != null) {
                        second2.LIZIZ = z;
                    }
                } else {
                    C2376409Sw second3 = pair2.getSecond();
                    if (second3 != null) {
                        second3.LIZ = 0;
                    }
                    C2376409Sw second4 = pair2.getSecond();
                    if (second4 != null) {
                        second4.LIZIZ = false;
                    }
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        notifyDataSetChanged();
    }
}

package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import irm.AkS92S0100000_25;

/* JADX INFO: renamed from: X.0tEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657330tEJ extends RecyclerView.ViewHolder {
    public final View LL;
    public final InterfaceC1635410sex LLILLJJLI;
    public final InterfaceC1657310tEH LLILLL;
    public final C19470511Fn LLILZ;
    public StickerWrapper LLILZIL;

    public final void I5(StickerWrapper stickerWrapper) {
        C19470511Fn c19470511Fn = this.LLILZ;
        int i = stickerWrapper.mState;
        int i2 = stickerWrapper.downloadProgress;
        C19470411Fm imageView = c19470511Fn.getImageView();
        C415800GSc c415800GSc = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            imageView.getClass();
                            return;
                        }
                        if (imageView.LLJ) {
                            if (imageView.LLILLJJLI.getVisibility() != 0) {
                                C786410Ut5.G1(imageView.LLILLJJLI, 0);
                            }
                            imageView.LLILLJJLI.setProgressIfCircle(i2);
                            return;
                        }
                        ImageView imageView2 = imageView.LLILZIL;
                        if (imageView2 == null) {
                            imageView2 = null;
                        }
                        C786410Ut5.LJZI(4, imageView2);
                        C415800GSc c415800GSc2 = imageView.LLILZLL;
                        if (c415800GSc2 == null) {
                            c415800GSc2 = null;
                        }
                        if (c415800GSc2.getVisibility() != 0) {
                            C415800GSc c415800GSc3 = imageView.LLILZLL;
                            if (c415800GSc3 == null) {
                                c415800GSc3 = null;
                            }
                            C786410Ut5.L0(c415800GSc3, 0);
                        }
                        C415800GSc c415800GSc4 = imageView.LLILZLL;
                        if (c415800GSc4 != null) {
                            c415800GSc = c415800GSc4;
                        }
                        c415800GSc.setProgress(i2);
                        return;
                    }
                    ImageView imageView3 = imageView.LLILZIL;
                    if (imageView3 == null) {
                        imageView3 = null;
                    }
                    C786410Ut5.LJZI(4, imageView3);
                    C415800GSc c415800GSc5 = imageView.LLILZLL;
                    if (c415800GSc5 != null) {
                        c415800GSc = c415800GSc5;
                    }
                    C786410Ut5.L0(c415800GSc, 4);
                    C786410Ut5.G1(imageView.LLILLJJLI, 4);
                    return;
                }
                if (imageView.LLJ) {
                    C786410Ut5.G1(imageView.LLILLJJLI, 4);
                    return;
                }
                if (imageView.LLIZ) {
                    ImageView imageView4 = imageView.LLILZIL;
                    if (imageView4 == null) {
                        imageView4 = null;
                    }
                    C786410Ut5.LJZI(0, imageView4);
                } else {
                    ImageView imageView5 = imageView.LLILZIL;
                    if (imageView5 == null) {
                        imageView5 = null;
                    }
                    C786410Ut5.LJZI(4, imageView5);
                }
                C415800GSc c415800GSc6 = imageView.LLILZLL;
                if (c415800GSc6 != null) {
                    c415800GSc = c415800GSc6;
                }
                C786410Ut5.L0(c415800GSc, 4);
                return;
            }
            if (imageView.LLJ) {
                C786410Ut5.G1(imageView.LLILLJJLI, 0);
                imageView.LLILLJJLI.setProgressIfCircle(0.0f);
                return;
            }
            ImageView imageView6 = imageView.LLILZIL;
            if (imageView6 == null) {
                imageView6 = null;
            }
            C786410Ut5.LJZI(4, imageView6);
            C415800GSc c415800GSc7 = imageView.LLILZLL;
            if (c415800GSc7 == null) {
                c415800GSc7 = null;
            }
            C786410Ut5.L0(c415800GSc7, 0);
            C415800GSc c415800GSc8 = imageView.LLILZLL;
            if (c415800GSc8 != null) {
                c415800GSc = c415800GSc8;
            }
            c415800GSc.setProgress(0);
            return;
        }
        if (imageView.LLJ) {
            C786410Ut5.G1(imageView.LLILLJJLI, 8);
            return;
        }
        ImageView imageView7 = imageView.LLILZIL;
        if (imageView7 == null) {
            imageView7 = null;
        }
        C786410Ut5.LJZI(4, imageView7);
        C415800GSc c415800GSc9 = imageView.LLILZLL;
        if (c415800GSc9 != null) {
            c415800GSc = c415800GSc9;
        }
        C786410Ut5.L0(c415800GSc, 4);
    }

    public final void L5(final boolean z) {
        StickerWrapper stickerWrapper;
        StickerWrapper stickerWrapper2;
        StickerWrapper stickerWrapper3 = this.LLILZIL;
        if (stickerWrapper3 == null) {
            stickerWrapper = null;
        } else {
            stickerWrapper = stickerWrapper3;
        }
        if (stickerWrapper.mState == 2) {
            return;
        }
        if (stickerWrapper3 == null) {
            stickerWrapper2 = null;
        } else {
            stickerWrapper2 = stickerWrapper3;
        }
        if (stickerWrapper2.mState == 1) {
            this.LLILZ.LJFF(true);
            this.LLILLL.LLJJJJ(getAdapterPosition(), z);
            this.LLILZ.LJFF(true);
        } else {
            if (stickerWrapper3 == null) {
                stickerWrapper3 = null;
            }
            this.LLILLJJLI.LIZJ(stickerWrapper3.mEffect, new IEffectDownloadProgressListener() { // from class: X.0tEI
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                    StickerWrapper stickerWrapper4;
                    C1657330tEJ c1657330tEJ = this.LIZ;
                    StickerWrapper stickerWrapper5 = c1657330tEJ.LLILZIL;
                    if (stickerWrapper5 == null) {
                        stickerWrapper4 = null;
                    } else {
                        stickerWrapper4 = stickerWrapper5;
                    }
                    stickerWrapper4.mState = 2;
                    if (stickerWrapper5 == null) {
                        stickerWrapper5 = null;
                    }
                    c1657330tEJ.I5(stickerWrapper5);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    StickerWrapper stickerWrapper4;
                    C1657330tEJ c1657330tEJ = this.LIZ;
                    StickerWrapper stickerWrapper5 = c1657330tEJ.LLILZIL;
                    if (stickerWrapper5 == null) {
                        stickerWrapper4 = null;
                    } else {
                        stickerWrapper4 = stickerWrapper5;
                    }
                    stickerWrapper4.mState = 1;
                    if (stickerWrapper5 == null) {
                        stickerWrapper5 = null;
                    }
                    c1657330tEJ.I5(stickerWrapper5);
                    C1657330tEJ c1657330tEJ2 = this.LIZ;
                    boolean z2 = z;
                    c1657330tEJ2.LLILZ.LJFF(true);
                    c1657330tEJ2.LLILLL.LLJJJJ(c1657330tEJ2.getAdapterPosition(), z2);
                    c1657330tEJ2.LLILZ.LJFF(true);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    View view = this.LIZ.LL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.hzf);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZLLL(view, 3072, creativeToastBuilder);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public final void onProgress(Effect effect, int i, long j) {
                    StickerWrapper stickerWrapper4;
                    StickerWrapper stickerWrapper5;
                    C1657330tEJ c1657330tEJ = this.LIZ;
                    StickerWrapper stickerWrapper6 = c1657330tEJ.LLILZIL;
                    if (stickerWrapper6 == null) {
                        stickerWrapper4 = null;
                    } else {
                        stickerWrapper4 = stickerWrapper6;
                    }
                    stickerWrapper4.mState = 5;
                    if (stickerWrapper6 == null) {
                        stickerWrapper5 = null;
                    } else {
                        stickerWrapper5 = stickerWrapper6;
                    }
                    stickerWrapper5.downloadProgress = i;
                    if (stickerWrapper6 == null) {
                        stickerWrapper6 = null;
                    }
                    c1657330tEJ.I5(stickerWrapper6);
                }
            });
        }
    }

    public C1657330tEJ(View view, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1657310tEH interfaceC1657310tEH) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC1635410sex;
        this.LLILLL = interfaceC1657310tEH;
        this.LLILZ = (C19470511Fn) view.findViewById(R.id.oiq);
        C786410Ut5.I7(new AkS92S0100000_25(this, 2), this.itemView);
    }
}

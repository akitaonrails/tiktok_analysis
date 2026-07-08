package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Lu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557670Lu1 implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public final LifecycleOwner LL;
    public final C530510KrJ LLILLJJLI;
    public TuxTextView LLILLL;
    public Context LLILZ;
    public AlbumAiSelfTaskViewModel albumAiSelfTaskViewModel;
    public C1295960jpS exploreAiSelfImage;
    public final Function1<Integer, Unit> goToAiSelfPage;
    public Bitmap originalBitmap;
    public String targetImageKey;
    public final ACListenerS143S0100000_8 LLILZIL = new ACListenerS143S0100000_8(this, 116);
    public boolean enableClick = true;
    public final InterfaceC332260D0u<Boolean> lottieAnimationLoadedFlow = C1BNE.LIZ(Boolean.FALSE);

    @Override // X.InterfaceC529800KqA
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public int layoutRes() {
        return R.layout.ov;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needFullSpan() {
        return false;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needGray() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public void onFirstScreenLoaded(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public void onRecoverFromGray() {
        this.enableClick = true;
    }

    @Override // X.InterfaceC529800KqA
    public void onSetGray() {
        this.enableClick = false;
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    public final void updateProfileImage() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, null, null, new C557680Lu2(this, null), 3);
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return this.LLILZIL;
    }

    public final Bitmap decodeBitmap(String str) {
        if (u.LJJIIJZLJL(str, "data:", false) && a0.LJJJ(str, "base64,", 0, false, 6) > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                byte[] bArrDecode = Base64.decode(str.substring(a0.LJJIZ(str, ',', 0, false, 6) + 1), 0);
                return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
        ImageView.ScaleType scaleType;
        Resources resources;
        Configuration configuration;
        if (this.exploreAiSelfImage == null) {
            this.exploreAiSelfImage = (C1295960jpS) view.findViewById(R.id.hgm);
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Default ScaleType: ");
            C1295960jpS c1295960jpS = this.exploreAiSelfImage;
            if (c1295960jpS != null) {
                scaleType = c1295960jpS.getScaleType();
            } else {
                scaleType = null;
            }
            sbLIZ.append(scaleType);
            C201955140j.LIZLLL(c552700Lm0, "LottieScale", C2188811AlT.LIZIZ(sbLIZ));
            C1295960jpS c1295960jpS2 = this.exploreAiSelfImage;
            if (c1295960jpS2 != null) {
                Context context = this.LLILZ;
                if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.getLayoutDirection() == 1) {
                    C786410Ut5.Wb(c1295960jpS2, -1.0f);
                    c1295960jpS2.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/creation-obj-us/ai_image_create_ai_self_cell_rtl.json");
                } else {
                    c1295960jpS2.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/creation-obj-us/ai_image_create_ai_self_cell.json");
                }
            }
            C1295960jpS c1295960jpS3 = this.exploreAiSelfImage;
            if (c1295960jpS3 != null) {
                c1295960jpS3.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0Lu3
                    @Override // X.InterfaceC1296230jpt
                    public final void LIZ(C1294720jnS c1294720jnS) {
                        Bitmap bitmapDecodeBitmap;
                        String str;
                        Map<String, C1294320jmo> map = c1294720jnS.LIZLLL;
                        C557670Lu1 c557670Lu1 = this.LL;
                        if (c557670Lu1.originalBitmap == null && map != null) {
                            String str2 = (String) C13LP.LJJJLIIL(map.keySet());
                            if (str2 == null) {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c557670Lu1.targetImageKey = str2;
                            C1294320jmo c1294320jmo = map.get("__original__");
                            if (c1294320jmo == null) {
                                C1294320jmo c1294320jmo2 = map.get(this.LL.targetImageKey);
                                if (c1294320jmo2 == null || (bitmapDecodeBitmap = c1294320jmo2.LJFF) == null) {
                                    C557670Lu1 c557670Lu12 = this.LL;
                                    bitmapDecodeBitmap = null;
                                    if (c1294320jmo2 != null && (str = c1294320jmo2.LIZLLL) != null) {
                                        bitmapDecodeBitmap = c557670Lu12.decodeBitmap(str);
                                    }
                                }
                                this.LL.originalBitmap = bitmapDecodeBitmap;
                                if (bitmapDecodeBitmap != null) {
                                    C1294320jmo c1294320jmo3 = new C1294320jmo(bitmapDecodeBitmap.getWidth(), bitmapDecodeBitmap.getHeight(), "__original__", "", "");
                                    c1294320jmo3.LJFF = bitmapDecodeBitmap;
                                    map.put("__original__", c1294320jmo3);
                                }
                                C201955140j.LIZLLL(C552700Lm0.LIZIZ, "LottieImages", "Saved original bitmap for key: " + this.LL.targetImageKey + ", bitmap: " + this.LL.originalBitmap);
                            } else {
                                this.LL.originalBitmap = c1294320jmo.LJFF;
                            }
                        }
                        this.LL.lottieAnimationLoadedFlow.setValue(Boolean.TRUE);
                        this.LL.updateProfileImage();
                        C1295960jpS c1295960jpS4 = this.LL.exploreAiSelfImage;
                        if (c1295960jpS4 != null) {
                            c1295960jpS4.playAnimation();
                        }
                    }
                });
            }
        }
        if (this.LLILLL == null) {
            this.LLILLL = (TuxTextView) view.findViewById(R.id.hgl);
        }
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
        this.LLILZ = activity;
    }

    public final void updateBitmapInternal(Bitmap bitmap) {
        int i;
        int i2;
        if (bitmap != null) {
            C1295960jpS c1295960jpS = this.exploreAiSelfImage;
            if (c1295960jpS != null) {
                c1295960jpS.updateBitmap(this.targetImageKey, bitmap);
            }
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C530510KrJ c530510KrJ = this.LLILLJJLI;
                if (c530510KrJ != null && Integer.valueOf(c530510KrJ.LIZ) != null) {
                    i2 = this.LLILLJJLI.LIZ;
                } else {
                    i2 = 2131825497;
                }
                tuxTextView.setText(tuxTextView.getContext().getString(i2));
                return;
            }
            return;
        }
        C1295960jpS c1295960jpS2 = this.exploreAiSelfImage;
        if (c1295960jpS2 != null) {
            c1295960jpS2.updateBitmap(this.targetImageKey, this.originalBitmap);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 == null) {
            return;
        }
        C530510KrJ c530510KrJ2 = this.LLILLJJLI;
        if (c530510KrJ2 != null && Integer.valueOf(c530510KrJ2.LIZ) != null) {
            i = this.LLILLJJLI.LIZ;
        } else {
            i = 2131825498;
        }
        tuxTextView2.setText(tuxTextView2.getContext().getString(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C557670Lu1(AlbumAiSelfTaskViewModel albumAiSelfTaskViewModel, Function1<? super Integer, Unit> function1, LifecycleOwner lifecycleOwner, C530510KrJ c530510KrJ) {
        this.albumAiSelfTaskViewModel = albumAiSelfTaskViewModel;
        this.goToAiSelfPage = function1;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c530510KrJ;
    }
}

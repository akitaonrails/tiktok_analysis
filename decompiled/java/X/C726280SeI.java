package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryArchiveV2FeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryHighlightsFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryMusicCoverFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryRevealFeedViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726280SeI {
    public static StoryFeedViewModel LIZ(Fragment fragment, ViewModelStoreOwner viewModelStoreOwner, C2189821An6 c2189821An6) {
        InterfaceC726330SeN interfaceC726330SeN;
        if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_ARCHIVE") && C1189504l3.LIZ()) {
            interfaceC726330SeN = new InterfaceC726330SeN() { // from class: X.0SeJ
                @Override // X.InterfaceC726330SeN
                public final StoryFeedViewModel LIZ(Fragment fragment2, ViewModelStoreOwner viewModelStoreOwner2, C2189821An6 c2189821An62) {
                    ViewModelProvider viewModelProviderLIZJ = C712430Rx3.LIZJ(fragment2, viewModelStoreOwner2, new ViewModelProvider.Factory(fragment2, c2189821An62) { // from class: X.06Y1
                        public final LifecycleOwner LIZ;
                        public final C2189821An6 LIZIZ;

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final <T extends ViewModel> T create(Class<T> cls) {
                            return new StoryArchiveV2FeedViewModel(this.LIZ, this.LIZIZ);
                        }

                        {
                            this.LIZ = fragment2;
                            this.LIZIZ = c2189821An62;
                        }
                    });
                    String eventType = c2189821An62.getEventType();
                    if (eventType != null) {
                        return (StoryFeedViewModel) viewModelProviderLIZJ.get(eventType, StoryArchiveV2FeedViewModel.class);
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            };
        } else if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS")) {
            interfaceC726330SeN = new InterfaceC726330SeN() { // from class: X.0SeK
                @Override // X.InterfaceC726330SeN
                public final StoryFeedViewModel LIZ(Fragment fragment2, ViewModelStoreOwner viewModelStoreOwner2, C2189821An6 c2189821An62) {
                    ViewModelProvider viewModelProviderLIZJ = C712430Rx3.LIZJ(fragment2, viewModelStoreOwner2, new ViewModelProvider.Factory(fragment2, c2189821An62) { // from class: X.06LF
                        public final LifecycleOwner LIZ;
                        public final C2189821An6 LIZIZ;

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final <T extends ViewModel> T create(Class<T> cls) {
                            return new StoryHighlightsFeedViewModel(this.LIZ, this.LIZIZ);
                        }

                        {
                            this.LIZ = fragment2;
                            this.LIZIZ = c2189821An62;
                        }
                    });
                    String eventType = c2189821An62.getEventType();
                    if (eventType != null) {
                        return (StoryFeedViewModel) viewModelProviderLIZJ.get(eventType, StoryHighlightsFeedViewModel.class);
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            };
        } else if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_MUSIC_COVER_AVATAR") && C298510Bmz.LIZ()) {
            interfaceC726330SeN = new InterfaceC726330SeN() { // from class: X.0SeL
                @Override // X.InterfaceC726330SeN
                public final StoryFeedViewModel LIZ(Fragment fragment2, ViewModelStoreOwner viewModelStoreOwner2, C2189821An6 c2189821An62) {
                    ViewModelProvider viewModelProviderLIZJ = C712430Rx3.LIZJ(fragment2, viewModelStoreOwner2, new ViewModelProvider.Factory(fragment2, c2189821An62) { // from class: X.0OZP
                        public final LifecycleOwner LIZ;
                        public final C2189821An6 LIZIZ;

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final <T extends ViewModel> T create(Class<T> cls) {
                            return new StoryMusicCoverFeedViewModel(this.LIZ, this.LIZIZ);
                        }

                        {
                            this.LIZ = fragment2;
                            this.LIZIZ = c2189821An62;
                        }
                    });
                    String eventType = c2189821An62.getEventType();
                    if (eventType != null) {
                        return (StoryFeedViewModel) viewModelProviderLIZJ.get(eventType, StoryMusicCoverFeedViewModel.class);
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            };
        } else {
            C728010Sh5.LIZ.getClass();
            if (C728010Sh5.LIZIZ() && Intrinsics.LJFF(c2189821An6.getAid(), "reveal_story")) {
                interfaceC726330SeN = new InterfaceC726330SeN() { // from class: X.0SeM
                    @Override // X.InterfaceC726330SeN
                    public final StoryFeedViewModel LIZ(final Fragment fragment2, ViewModelStoreOwner viewModelStoreOwner2, final C2189821An6 c2189821An62) {
                        ViewModelProvider viewModelProviderLIZJ = C712430Rx3.LIZJ(fragment2, viewModelStoreOwner2, new ViewModelProvider.Factory(fragment2, c2189821An62) { // from class: X.0SgD
                            public final LifecycleOwner LIZ;
                            public final C2189821An6 LIZIZ;

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final <T extends ViewModel> T create(Class<T> cls) {
                                return new StoryRevealFeedViewModel(this.LIZ, this.LIZIZ);
                            }

                            {
                                this.LIZ = fragment2;
                                this.LIZIZ = c2189821An62;
                            }
                        });
                        String eventType = c2189821An62.getEventType();
                        if (eventType != null) {
                            return (StoryFeedViewModel) viewModelProviderLIZJ.get(eventType, StoryRevealFeedViewModel.class);
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                };
            } else {
                interfaceC726330SeN = new InterfaceC726330SeN() { // from class: X.0SeH
                    @Override // X.InterfaceC726330SeN
                    public final StoryFeedViewModel LIZ(Fragment fragment2, ViewModelStoreOwner viewModelStoreOwner2, C2189821An6 c2189821An62) {
                        ViewModelProvider viewModelProviderLIZJ = C712430Rx3.LIZJ(fragment2, viewModelStoreOwner2, new ViewModelProvider.Factory(fragment2, c2189821An62) { // from class: X.06WX
                            public final LifecycleOwner LIZ;
                            public final C2189821An6 LIZIZ;

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                            }

                            @Override // androidx.lifecycle.ViewModelProvider.Factory
                            public final <T extends ViewModel> T create(Class<T> cls) {
                                return new StoryFeedViewModel(this.LIZ, this.LIZIZ);
                            }

                            {
                                this.LIZ = fragment2;
                                this.LIZIZ = c2189821An62;
                            }
                        });
                        String eventType = c2189821An62.getEventType();
                        if (eventType != null) {
                            return (StoryFeedViewModel) viewModelProviderLIZJ.get(eventType, StoryFeedViewModel.class);
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                };
            }
        }
        return interfaceC726330SeN.LIZ(fragment, viewModelStoreOwner, c2189821An6);
    }
}
